public class ChristmasDrone extends Dron
{
    private Gift gift;

    ChristmasDrone(byte uniqueId, String name, double weight, double enginePower, double batteryLevel,
                   Gift gift)
    {
        super(uniqueId, name, weight, enginePower, batteryLevel);
        this.gift = gift;
    }

    ChristmasDrone(byte uniqueId, String name, Gift gift)
    {
        super(uniqueId, name, 10d, 15d, 50d);
        this.gift = gift;
    }

    public void deliverGift()
    {
        if(
                gift == null ||
                getValue("weight") + gift.getWeight() > getValue("enginePower") ||
                !gift.getStatus()
        )
        {
            System.out.println("Cannot deliver gift. Conditions not met");
        }
        else
        {
            System.out.println("Dostarczono " + gift.getName() + " paczkę.");
            gift = null;
        }
    }

    // Getter
    public Gift getTransportedGift() { return gift; }

    // Setter
    public void setTransportedGift(Gift gift) { this.gift = gift; }
}
