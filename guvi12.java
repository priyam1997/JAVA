import java.util.*;
public class Pald {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int len = s.length();
        int num = Integer.parseInt(s);
        int temp = num;
        int m , result=0;

        for(int i=(len-1);i>=0;i--)
        {
            m = temp%10;
            temp = temp/10;
            result = result+(m*(int)Math.pow(10,i));
        }

        if(result==num)
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Not Palindrom");
        }
    }
}
