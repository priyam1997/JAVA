import java.util.*;
class CHchar{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char c = scan.next().charAt(0);

    if(c>='a' && c<='z' || c>='A'&&c<='Z')
    {
      System.out.println("Character");
    }
    else
    {
      System.out.println("Not a Character");
    }
  }
}
