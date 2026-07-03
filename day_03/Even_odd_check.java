import java.util.*;
public class Even_odd_check
{
    public static void main(String args[])
    {
        // taking input from user
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();

        // checking the number is even or odd
        if(num%2==0)
        {
            System.out.println( "Number is even ");

        }
        else
        {
            System.out.println("Number is odd");
            
        }
    }
}