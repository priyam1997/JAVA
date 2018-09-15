import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int c=0;
        if(num>1)
        {
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }

        if(c<=2)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}
