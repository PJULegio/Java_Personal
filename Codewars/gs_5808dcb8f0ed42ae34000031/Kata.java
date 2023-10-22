public class Kata
{
  public static String switchItUp(int number)
  {   
    String value = switch(number)
    {
      case 0 -> { yield "Zero"; }
      case 1 -> { yield "One"; }
      case 2 -> { yield "Two"; }
      case 3 -> { yield "Three"; }
      case 4 -> { yield "Four"; }
      case 5 -> { yield "Five"; }
      case 6 -> { yield "Six"; }
      case 7 -> { yield "Seven"; }
      case 8 -> { yield "Eight"; }
      case 9 -> { yield "Nine"; }
      default -> { yield "None"; }
    };

    return value;
  }
}