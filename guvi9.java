import java.util.*;
class Arr{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int[] a = new int[n];
    int sum=0;

    for(int i=0;i<n;i++)
    {
      a[i] = scan.nextInt();
    }

    for(int i=0;i<k;i++)
    {
      sum = sum+a[i];
    }

    System.out.println("Sum is "+sum);
  }
}
