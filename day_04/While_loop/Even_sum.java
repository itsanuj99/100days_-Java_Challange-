 import java.util.*;
 public class Even_sum
 {
    public static void main(String args[])
    {
        // taking the input form user
        int n;
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Natural Number");
        n=sc.nextInt();

        // printing the sum of natural number using while loop
        int i=2;
        while(i<=n)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
            i++;
        }
        System.out.println("Sum of Even" + n + "Natural number is: "+sum);
    }
 }