import java.util.Scanner;
public class competitive
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
         int n = obj.nextInt();
         int r=0;int count=0;
         for(int i=0;i<=n-1;i++)
         {
            System.out.println("Enter the value of a");
            int a = obj.nextInt();
            System.out.println("Enter the value of b");
            int b = obj.nextInt();
            System.out.println("Enter the value of c");
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
         



    
