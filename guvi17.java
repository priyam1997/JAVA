import java.util.*;
public class Armstrong {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int len = s.length();
        int num = Integer.parseInt(s);
        int temp = num;
        int m , result=0;

        for(int i=0;i<len;i++)
        {
            m = temp%10;
            temp = temp/10;
            result = result+(int)Math.pow(m,len);
        }

        if(result==num)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
