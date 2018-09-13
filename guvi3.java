import java.util.*;
class VCchar{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char ch = scan.next().charAt(0);
    char[] c = {'a','e','i','o','u'};

    for(int i=0;i<c.length;i++)
    {
      if(c[i]==ch)
      {
        System.out.println("Vowel");
        break;
      }
      else
      {
        System.out.println("Consonant");
        break;
      }
    }

  }
}
