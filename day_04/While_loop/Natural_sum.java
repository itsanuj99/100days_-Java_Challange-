 import java.util.*;
 public class Natural_sum
    {
        public static void main(String args[])
        {
            // taking the input from user
            int n;
            int sum=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Natural number");
            n=sc.nextInt();

            // printing the sm of natural number using while loop
            int i=1;
            while(i<=n)
            {
                sum=sum+i;
                i++;
            }
            System.out.println("Sum of Natural number is: "+sum);
    }
}
 