import java .util.*;
public class limak
{
    private static Scanner ob;
    

    public static void main(String [] args)
    {
        ob = new Scanner(System.in);
        System.out.println("Enter the weight of limak");
        int a = ob.nextInt();
        System.out.println("Enter the weight of bob");
        int b = ob.nextInt(); int A=a; int B=b;int c=0;
         while(A<=B)
         {
             A= A*3;
             B= B*2;
             c++;
         }
         System.out.println(c);
         
    }
}