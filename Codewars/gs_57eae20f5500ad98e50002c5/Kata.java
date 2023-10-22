public class Kata {
    public static String noSpace(final String x) {
        String result = "";

        for(int i = 0, j = 0; j < x.length(); i++, j++)
        {
            if(x.charAt(j) != 32)
                result = result + x.charAt(j);
        }

        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(noSpace("8aaaaa dddd r     "));
    }
}