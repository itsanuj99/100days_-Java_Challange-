 import java.util.*;
 public class N
 {
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int sum=0;
        do{
            n=sc.nextInt();

            if(n==0)
            {
                break;
            }
        
                sum=sum+n;
                System.out.println(sum);
            } 
            while(true);
    }

 }