 import java.util.*;
 public class FactorialSum
 {
    public static void main (String args[])
    {
        int fact=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        // factorial of  every number
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
            System.out.println("Factorial of " +i+ "=" +fact );
        }
    }
 }