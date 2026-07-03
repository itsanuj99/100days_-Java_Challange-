import java.util.*;
public class Smaller {
    public static void main (String args[])
    {
        int a,b;
        Scanner sc= new Scanner(System.in);

        // input of firsr number form user
        System.out.println("Enter a number");
        a=sc.nextInt(); // reading the first number from the user

        // input of second number from user
        System.out.println("Enter second number");
        b=sc.nextInt(); // reading the second number from the user

        // checking which number is smaller
        if(a<b)
        {
            System.out.println("The smaller number is:" + a); // if a is smaller
        }
        else if (b<a)
        {
            System.out.println("The smaller number is:" + b); // if b is smaller
        }
        else
        {
            System.out.println("Both are equal"); // if both are equal
        }
    }
}

