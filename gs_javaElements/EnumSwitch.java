public class EnumSwitch
{
    public static void main(String[] args)
    {
        enum Day { SUNNY, CLOUDY, OTHER }
        // Day day = Day.SUNNY;
        // Day day = Day.CLOUDY;
        Day day = Day.OTHER;

        switch (day)
        {
            case SUNNY:
                System.out.println("Sunny");
            break;
            case CLOUDY:
                System.out.println("Cloudy");
            break;
            default:
                System.out.println("Other");
        }

        switch (day)
        {
            case SUNNY -> System.out.println("Słonecznie");
            case CLOUDY -> System.out.println("Pochmurno");
            default -> System.out.println("Inne"); // gdy nie ma, nic się nie drukuje
        }

        int result = switch (day)
        {
            case SUNNY:
                yield 6;
            case CLOUDY:
                yield 8;
            default:
                yield 0;
        }; // tutaj średnik
        System.out.println(result);
    }
}
