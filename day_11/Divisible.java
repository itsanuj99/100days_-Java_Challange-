import java.util.*;
public class Divisible {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number");
        int a=sc.nextInt();

        System.out.println("Enter a number");
        int b= sc.nextInt();
        
        for(int i =a;i<=b;i++)
        {
            if (i%7==0) {
                System.out.println(i);
                
            }
        }
    }
}
