import java.util.*;
public class Odd_sum
{
    public static void main(String args[])
        {
            // taking input from user
            int n;
            int sum=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            n=sc.nextInt();

            // printing the sum of odd natural number using while loop
            int i=1;
            while(i<=n)
            {
                if(i%2!=0)
                {
                    sum=sum+i;
                }
                i++;
            }
            System.out.println("Sum of Odd" + n + "Natural number is: "+sum);

        }
    
}