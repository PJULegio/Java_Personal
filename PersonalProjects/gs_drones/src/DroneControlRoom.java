public class DroneControlRoom
{
    public static Dron[] allDrones = new Dron[0];
    private double windPowerOutside;

    DroneControlRoom(double windPowerOutside)
    {
        this.windPowerOutside = windPowerOutside;
    }

    DroneControlRoom()
    {
        this(5.0d);
    }

    public void countDronesThatCanFly()
    {
        int numberOfDronesThatCanFly = 0;

        for(Dron dron : allDrones)
        {
            if(dron.getValue("enginePower") > dron.getValue("weight") &&
               dron.getValue("batteryLevel") > 0)
            {
                numberOfDronesThatCanFly++;
            }
        }

        System.out.println("Number of drones that can fly: " + numberOfDronesThatCanFly);
    }

    public void chargeAllDrones()
    {
        for(Dron dron : allDrones)
            dron.setValue("batteryLevel",
                    dron.getValue("batteryLevel") + 20d);
    }

    public static void addNewDrone(Dron newDrone)
    {
        Dron[] tempArray = allDrones;
        allDrones = new Dron[allDrones.length + 1];
        for(int dronIterator = 0; dronIterator < tempArray.length; dronIterator++)
            allDrones[dronIterator] = tempArray[dronIterator];

        allDrones[allDrones.length - 1] = newDrone;
    }

    public void sortAllDrones()
    {
        Dron[] operationArray = allDrones;
        int baseIterator, comparisonIterator;
        Dron temp;
        boolean swapped;

        for(baseIterator = 0; baseIterator < operationArray.length - 1; baseIterator++)
        {
            swapped = false;
            for(comparisonIterator = 0;
                comparisonIterator < operationArray.length - baseIterator - 1;
                comparisonIterator++)
            {
                if(operationArray[comparisonIterator].getValue("weight") > operationArray[comparisonIterator + 1].getValue("weight"))
                {
                    temp = operationArray[comparisonIterator];
                    operationArray[comparisonIterator] = operationArray[comparisonIterator + 1];
                    operationArray[comparisonIterator + 1] = temp;
                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }

        for(Dron dron : operationArray)
            System.out.println("ID: " + dron.getValue("uniqueId") +
                    " | " + dron.getName() +
                    " | weight: " + dron.getValue("weight"));
    }

    public void findMostPowerful(int i, int strongestDroneIndex)
    {
        if(i < allDrones.length)
        {
            if(allDrones[i].getValue("enginePower") > allDrones[strongestDroneIndex].getValue("enginePower"))
                strongestDroneIndex = i;
            findMostPowerful(i + 1, strongestDroneIndex);
        }
        else
            System.out.println("\nStrongest drone: " + allDrones[strongestDroneIndex].getValue("uniqueId") +
                    " | " + allDrones[strongestDroneIndex].getName() +
                    " | Power: " + allDrones[strongestDroneIndex].getValue("enginePower"));
    }

    public void findMostPowerful()
    {
        findMostPowerful(0, 0);
    }
}
