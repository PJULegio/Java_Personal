import java.util.Objects;

public class Dron
{
    private byte uniqueId;
    private String name;
    private double weight;
    private double enginePower;
    private double batteryLevel;

    Dron(byte uniqueId, String name, double weight, double enginePower, double batteryLevel)
    {
        this.uniqueId = uniqueId;
        this.name = name;
        this.weight = weight;
        this.enginePower = enginePower;
        this.batteryLevel = batteryLevel;
    }

    public boolean checkFlyParameters()
    {
        // Returns true if below conditions are met (simplify if statement)
        return (enginePower > weight && batteryLevel > 0);
    }

    public void fly(double distance)
    {
        if(batteryLevel > distance)
            batteryLevel -= distance;
        else
            System.out.println("Not enough battery for " + distance + "m flight! Remaining battery: " + batteryLevel);
    }

    public void revEngine()
    {
        for(int printIterator = 1; printIterator <= enginePower / weight; printIterator++)
            System.out.print("Vroom ");

        System.out.println();
    }

    // Getters
    public double getValue(String requestedValue)
    {
        switch (requestedValue)
        {
            case "uniqueId" -> { return uniqueId; }
            case "weight" -> { return weight; }
            case "enginePower" -> { return enginePower; }
            case "batteryLevel" -> { return batteryLevel; }
            default ->
            {
                System.out.println("[ERROR] Wrong parameter name: " + requestedValue + ". Returning 1.0");
                return 1d;
            }
        }
    }

    public String getName()
    {
        return name;
    }

    // Setters
    public void setValue(String parameterName, double value)
    {
        switch (parameterName)
        {
            case "weight" -> { this.weight = value; }
            case "enginePower" -> { this.enginePower = value; }
            case "batteryLevel" -> { this.batteryLevel = value; }
        }
    }

    public void setValue(String parameterName, byte value)
    {
        if(Objects.equals(parameterName, "uniqueId"))
            this.uniqueId = value;
    }

    public void setValue(String parameterName, String value)
    {
        if(Objects.equals(parameterName, "name"))
            this.name = value;
    }
}
