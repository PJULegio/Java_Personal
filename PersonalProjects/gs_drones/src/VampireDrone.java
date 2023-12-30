public class VampireDrone extends Dron
{
    private boolean isDoneBat;

    VampireDrone(byte uniqueId, double weight, double enginePower, double batteryLevel)
    {
        super(uniqueId, "Bram Stoker", weight, enginePower, batteryLevel);
        this.isDoneBat = false;
    }

    public void drainEnergy(Dron prayDrone)
    {
        if(!isDoneBat)
        {
            double consumedEnergy = prayDrone.getValue("batteryLevel") / 2;
            prayDrone.setValue("batteryLevel", consumedEnergy);
            setValue(
                    "batteryLevel",
                    getValue("batteryLevel") + consumedEnergy
            );
        }
        else
            System.out.println("Cannot be done - this drone is a bat");
    }

    public void turnIntoBatDrone()
    {
        isDoneBat = true;
        setValue("batteryLevel", getValue("batteryLevel") / 2);
        setValue("weight", getValue("weight") / 2);
    }
}
