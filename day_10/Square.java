 import java.util.*;
 public class Square
 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // taking input from user
        System.out.println("Enter a number");
        int num1=sc.nextInt();

        //for loop 
        for(int i=1;i<=num1;i++)
        {
            System.out.println("Suqare of "+i+ " = " +(i*i));
        }
    }
 }
