import java.util.*;
public class Factorial
{
    public static void main(String args[])
    {
        int n;
        int fact=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();

        //print the factorial
        int i=1;
        while(i<=n)
        {
            fact=fact*n;
            n--;
        }
        System.out.println(fact);
        
    }
    
}