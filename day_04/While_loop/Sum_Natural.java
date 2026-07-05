import java.util.*;
public class Sum_Natural 
{
    public static void main(String args[])

    {
        int n;
        int sum=0;

        //Scanner class object creation
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to sum upto N terms");

        //taking input from user
        n=sc.nextInt();

// for loop to calculate the sum of natural numbers
   
        for(int i=1;i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.println("Sum of the first" +n+ "Natural number is :" +sum);
    }
    


}
