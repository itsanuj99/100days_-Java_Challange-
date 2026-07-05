import java.util.*;
public class Multiplication {

    public static void main (String args[])
    {
        // input a number for the multiplication table
        int n;
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();

        // using while loop printing the table of the number 

        int i=1;
        while(i<=10)
        {
            System.out.println(n + "x" + i + "=" +n*i);
            i++;

        }
    }
}
