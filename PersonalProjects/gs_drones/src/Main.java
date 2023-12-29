public class Main
{
    public static void consoleOutputDivider(Dron dron)
    {
        System.out.println("\n----------------------------------\n");
        System.out.println(
                "Dron: " +
                        dron.getValue("uniqueId") +
                        " | " +
                        dron.getName()
        );
    }

    public static void main(String[] args)
    {
        // Dron ID: 1
        Dron dronTestowy = new Dron((byte)1, "DronTestowy", 10d, 30d, 80d);
        Main.consoleOutputDivider(dronTestowy);

        System.out.println(dronTestowy.checkFlyParameters());

        System.out.println(dronTestowy.getValue("batteryLevel"));
        dronTestowy.fly(50.5);
        System.out.println(dronTestowy.getValue("batteryLevel"));
        dronTestowy.fly(50.5);

        dronTestowy.revEngine();

        // Dron ID: 2
        Dron dronTestowyCiezki = new Dron((byte)2, "CiezkiDron", 20d, 10d, 50d);
        Main.consoleOutputDivider(dronTestowyCiezki);

        System.out.println(dronTestowyCiezki.checkFlyParameters());

        System.out.println(dronTestowyCiezki.getValue("batteryLevel"));
        dronTestowyCiezki.fly(50.5);
        dronTestowyCiezki.fly(20.5);
        System.out.println(dronTestowyCiezki.getValue("batteryLevel"));
        dronTestowyCiezki.fly(30.5);

        dronTestowyCiezki.revEngine();

        // RACING DRONES
        RacingDrone[] raceDrones = new RacingDrone[3];
        // Dron ID: 3
        RacingDrone dronWyscigowy1 = new RacingDrone((byte)3, "DronWyscigowy1", 10d, 50d, 80d, "RampolisRT", 7);
        raceDrones[0] = dronWyscigowy1;
        Main.consoleOutputDivider(dronWyscigowy1);
        dronWyscigowy1.revEngine();

        // Dron ID: 4
        RacingDrone dronWyscigowy2 = new RacingDrone((byte)4, "DronWyscigowy2", 12d, 58d, 80d, "Verne Energy", 5);
        raceDrones[1] = dronWyscigowy2;
        Main.consoleOutputDivider(dronWyscigowy2);
        dronWyscigowy2.revEngine();

        // Dron ID: 5
        RacingDrone dronWyscigowy3 = new RacingDrone((byte)5, "DronWyscigowy3", 11d, 48d, 80d, "Corigis Power", 4);
        raceDrones[2] = dronWyscigowy3;
        Main.consoleOutputDivider(dronWyscigowy3);
        dronWyscigowy3.revEngine();


        System.out.println("Strongest: " + RacingDrone.race(raceDrones).getName());
        RacingDrone.sortByPosition(raceDrones);
    }
}
