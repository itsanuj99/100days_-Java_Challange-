 import java.util.Scanner;
public class Simple_Intrest {
    public static void main(String[] args) 
    {
        System.out.println("----------Simple Intrest----------");
        Scanner sc = new Scanner(System.in);
        
        // simple intrest
        System.out.println("Enter the Principal Amount "); // input principal amount
        double principal = sc.nextDouble();
        System.out.println("Enter the Rate of Interest "); // input rate of interest
        double rate = sc.nextDouble();
        System.out.println("Enter the Time in years "); // input time in years
        double time = sc.nextDouble();
        
        double simpleIntrest = (principal * rate * time) / 100; // formula of simple intrest
        System.out.println("The Simple Intrest is: " + simpleIntrest);

        // total amount 
        double totalAmount = principal + simpleIntrest; // formula of total amount
        System.out.println("The Total Amount is: " + totalAmount);
    }       
}  