public class CharProblem {
  public static int howOld(final String herOld) {
    int age = (int)(herOld.charAt(0)) - 48; // numbers in ASCII table start at 48
    return age;
  }

  public static void main(String[] args)
  {
    System.out.println(howOld("5 years old"));
  }
}