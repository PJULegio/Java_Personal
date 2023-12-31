import java.util.Objects;

public class RacingDrone extends Dron
{
    private String racingTeam;
    private int positionInRanking;

    RacingDrone(byte uniqueId, String name, double weight, double enginePower, double batteryLevel,
                String racingTeam, int positionInRanking)
    {
        super(uniqueId, name, weight, enginePower, batteryLevel);
        this.racingTeam = racingTeam;
        this.positionInRanking = positionInRanking;
    }

    public static RacingDrone race(RacingDrone[] racers)
    {
        RacingDrone strongestDrone = racers[0];
        for(int droneIterator = 0; droneIterator < racers.length; droneIterator++)
        {
            if(racers[droneIterator].getValue("enginePower") > strongestDrone.getValue("enginePower"))
                strongestDrone = racers[droneIterator];
        }

        return strongestDrone;
    }

    @Override
    public void revEngine()
    {
        super.revEngine();
        System.out.println("ZOOOOOM");
    }

    public static void sortByPosition(RacingDrone[] racers)
    {
        RacingDrone temp;

        for(int baseIterator = 0; baseIterator < racers.length; baseIterator++)
            for(int comparingIterator = baseIterator + 1; comparingIterator < racers.length; comparingIterator++)
                if(racers[comparingIterator].getValue("positionInRanking") > baseIterator)
                {
                    temp = racers[baseIterator];
                    racers[baseIterator] = racers[comparingIterator];
                    racers[comparingIterator] = temp;
                }
    }

    // Getters
    @Override
    public double getValue(String requestedValue)
    {
        if(Objects.equals(requestedValue, "positionInRanking"))
            return positionInRanking;
        else
            return super.getValue(requestedValue);
    }
}
