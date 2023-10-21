public class Kata {
  public static int rentalCarCost(int d) {
    int price = d * 40;
    
    if (d >= 3 && d < 7)
      price -= 20;
    else if (d >= 7)
      price -= 50;

    return price;
  }
}
