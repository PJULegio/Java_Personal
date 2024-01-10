public class Gift
{
    private String nameOfContent;
    private double weight;
    private boolean isReadyToBeDelivered;

    Gift(String nameOfContent, double weight, boolean isReadyToBeDelivered)
    {
        this.nameOfContent = nameOfContent;
        this.weight = weight;
        this.isReadyToBeDelivered = isReadyToBeDelivered;
    }

    public void prepare()
    {
        isReadyToBeDelivered = true;
    }

    public void unpack()
    {
        isReadyToBeDelivered = false;
        System.out.println(nameOfContent);
    }

    // Getters
    public double getWeight() { return weight; }
    public String getName() { return nameOfContent; }
    public boolean getStatus() { return isReadyToBeDelivered; }
}
