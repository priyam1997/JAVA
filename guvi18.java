import java.util.*;
class Armstrong {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int len = s.length();
        int n= Integer.parseInt(s);
        int m1 = scan.nextInt();
        int m , result=0;
      for(int j=n;j<m1;j++)
      {
        for(int i=0;i<len;i++)
        {
            m = j%10;
            j = j/10;
            result = result+(int)Math.pow(m,len);
        }
        if(result==j)
        {
            System.out.println(result);
        }
      }
    }
}
