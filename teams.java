/* Use this link to access this question on CodeForces: https://codeforces.com/problemset/problem/231/A*/
import java.util.Scanner;
public class teams
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
         int r=0;int count=0;
         for(int i=0;i<=n-1;i++)
         {
            int a = obj.nextInt();
            int b = obj.nextInt();
            int c = obj.nextInt();
            if(a==1)
            count++;
            if(b==1)
            count++;
            if(c==1)
            count++;
            if(count>=2)
            r++;
            count=0;
         }
          System.out.println(r);
          obj.close();
    }
}
         



    
