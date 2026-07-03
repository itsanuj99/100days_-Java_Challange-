import java.util.*;
public class Larger {
    public static void main (String args[])
    {
        // taking input from user 
        int a,b;
        Scanner sc=new Scanner(System.in);

        // input first number from user
        System.out.println("enter first number");
        a=sc.nextInt(); // reading the first number from the user

        // input second number from user
        System.out.println("Enter second number");
        b=sc.nextInt(); // reading the second number from the user
    
        if(a>b)
        {
            System.out.println("The larger number is: " + a); // if a is greater

        }
        else if(b>a)
        {
            System.out.println("The larger number is :" +b); // if b is greater
        }
        else
        {
            System.out.println("Both  numbers are equal"); // if Both are equal
        }
         
        }
    
}
