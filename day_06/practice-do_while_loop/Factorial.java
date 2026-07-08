 import java.util.*;
 public class Factorial
 {
    public static void main (String[]args)
    {
        int fact=1;
        int num;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        
        int i=1;
        do{
            fact=fact*num;
            num--;
        }
        while(i<=num);
        System.out.println(fact);

    }
 }