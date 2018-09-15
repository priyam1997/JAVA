import java.util.*;
class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int c=0,j;
        for(j=n;j<m;j++)
        {
        if(j>1)
        {
        for(int i=1;i<=j;i++)
        {
            if(j%i==0)
            {
                c++;
            }
            if(c==2)
            {
            System.out.println(j);
            }
        }

        }
    }
}
}
