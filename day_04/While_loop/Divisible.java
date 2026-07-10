import java.util.*;
public class Divisible 
{
    public static void main (String args[])
    {
         Scanner sc= new Scanner (System.in);
         
         // input first number
         System.out.println("Enter First number number");
         int a=sc.nextInt();

         // input second number
         System.out.println("Enter Second  number");
         int b= sc.nextInt();

         while(a<=b)
         {
            if (a%7==0)
            {
                System.out.println(a);
            }
            a++;
         }
    }
    
}
