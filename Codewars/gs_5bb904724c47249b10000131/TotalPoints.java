public class TotalPoints {
  
    public static int points(String[] games) {
        int points = 0;

        for(int i = 0; i < games.length; i++)
        {
            if(games[i].charAt(0) > games[i].charAt(2))
            points += 3;
            else if(games[i].charAt(0) == games[i].charAt(2))
            points += 1;
        }
        
        return points;
    }

    public static void main(String[] args)
    {
        String arr[] = {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"};
        System.out.println(points(arr));
    }
}