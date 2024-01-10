public class StringSwitch
{
    public static void main(String[] args)
    {
        // String animal = "DOG";
        String animal = "CAT";
        String result = "result";

        switch (animal)
        {
            case "DOG":
                result = "domestic animal";
                break;
            case "CAT":
                result = "feline";
                break;
        }
        System.out.println(result);
    }
}
