import java.util.*;
public class While 
{
    public static void main(String args[])
    {
        int n;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the Natural number");
     n=sc.nextInt();

     int i=0; int sum=0;
     while(i<=n)
     {
        sum=sum+i;
        i++;
        
     }
     System.out.println("Sum of Natural number is: "+sum);
    }

    
    
}
