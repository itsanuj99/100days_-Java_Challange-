 import java.util.*;
public class FactS
{
    public static void main(String args[])
    {
        int sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

        //Sum of all factor of given number....
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum of all Factors of a given number is :" +sum);
    }
}