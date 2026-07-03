 import java.util.*;
 public class Voting{
    public static void main (String args[])
    {
        // taking input from user
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age");
        age=sc.nextInt();

        // cheking elegibility for voting

        if(age>=18)
        {
            System.out.println("Person is eldgible for voting");

        }
        else{
            System.out.println("Person is not eledgible for voting");
        }


    }
 }