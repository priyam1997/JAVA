import java.util.*;
class Leap{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    n=n%100;

    if(n%4==0)
    {
      System.out.println("leap year");
    }
    else
    {
      System.out.println("Not a Leap year");
    }
  }
}
