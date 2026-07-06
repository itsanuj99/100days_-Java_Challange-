 import java.util.*;
public class Reverse
 {
    public static void main (String args[])
    {
        int num;
        int rev=0;
        int rem;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();

        do{
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;

        }
        while(num!=0);
            System.out.println(rev);

    }
    
}
