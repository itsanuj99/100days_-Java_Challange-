import java.util.*;
public class Divisibleby_7 {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);

        // enter first number
        System.out.println("Enter first number");
         int Num1=sc.nextInt();
    
    // enter second number
     System.out.println("Enter Second number");
       int  Num2=sc.nextInt();

        int i=Num1;
    for(i=Num1;i<=Num2;i++)
    {
        if(i%7==0)
        {
            
            System.out.println(i);
        }

    }
    
    }

    
}
