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

        // VAMPIRE DRONES
        // Dron ID: 6
        VampireDrone vamp1 = new VampireDrone((byte)6, 15d, 30d, 50d);
        Main.consoleOutputDivider(vamp1);
        System.out.println("Vampire drone energy before: " + vamp1.getValue("batteryLevel"));
        System.out.println("Pray drone energy before: " + dronWyscigowy2.getValue("batteryLevel"));
        vamp1.drainEnergy(dronWyscigowy2);
        System.out.println("Pray drone energy after: " + dronWyscigowy2.getValue("batteryLevel"));
        System.out.println("Vampire drone energy after: " + vamp1.getValue("batteryLevel"));

        vamp1.turnIntoBatDrone();
        System.out.println("Bat energy: " + vamp1.getValue("batteryLevel") + "\nBat weight: " + vamp1.getValue("weight"));

        vamp1.drainEnergy(dronTestowy);

        // GIFTS
        Gift teddyBear = new Gift("Teddy Bear", 2d, false);
        Gift toyCar = new Gift("Toy Car", 0.5d, true);
        Gift gardenToyHouse = new Gift("Garden Toy House", 10d, true);
        Gift phone = new Gift("Phone", 0.4d, false);

        // CHRISTMAS DRONES
        // Dron ID: 7
        ChristmasDrone christmasDrone1 = new ChristmasDrone((byte)7, "Delivery 1", teddyBear);
        Main.consoleOutputDivider(christmasDrone1);
        christmasDrone1.deliverGift();
        teddyBear.prepare();
        christmasDrone1.deliverGift();

        // Dron ID: 8
        ChristmasDrone christmasDrone2 = new ChristmasDrone((byte)8, "Delivery 2", toyCar);
        Main.consoleOutputDivider(christmasDrone2);
        christmasDrone2.deliverGift();
        christmasDrone2.deliverGift();
        toyCar.unpack();

        // Dron ID: 9
        ChristmasDrone christmasDrone3 = new ChristmasDrone((byte)9, "Delivery 3", gardenToyHouse);
        Main.consoleOutputDivider(christmasDrone3);
        christmasDrone3.deliverGift();
        gardenToyHouse.unpack();
        gardenToyHouse.prepare();
        gardenToyHouse.unpack();

        System.out.println(christmasDrone3.getTransportedGift());
        christmasDrone3.setTransportedGift(phone);
        System.out.println(christmasDrone3.getTransportedGift());
        christmasDrone3.deliverGift();
        phone.prepare();
        christmasDrone3.deliverGift();
        christmasDrone3.deliverGift();
        phone.unpack();
    }
}
