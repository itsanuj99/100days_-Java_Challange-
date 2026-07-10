 import java.util.*;
 
 public class FiboSum
 {
    public static void main(String args[])
    {
        int a=0,b=1,c,sum=0;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        
        // fibo-sum

        for(int i=0;i<=n;i++)
            {
                c=a+b;
                a=b;
                b=c;
                sum=sum+a;
                System.out.println(a+ " ");
            }
System.out.println("The sum of the first " + n + " Fibonacci terms is: " + sum);        
    }
 }