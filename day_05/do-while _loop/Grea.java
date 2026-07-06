 import java.util.*;
 /**
 * Grea
 */
public class Grea
 {
    public static void main(String args[])
    {
        int n;
        int max  = Integer.MIN_VALUE;;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
 
        do
        {
            n=sc.nextInt();
 
            if(n!=0&& n >max)
            {
                max=n;
            }
        }
            while(n!=0);
            
                if(max==Integer.MAX_VALUE)
                {
                    System.out.println("no number is greater");
                }
                else
                {
                    System.out.println(max);
                }
            

        
    }
}