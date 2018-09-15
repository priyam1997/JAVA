import java.util.*;
public class Multi {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result=0;

        for(int i=1;i<=n;i++)
        {
            result = n*i;
            System.out.println(result);
        }

    }
}
