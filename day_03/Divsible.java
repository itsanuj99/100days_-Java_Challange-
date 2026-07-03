import java.util.Scanner;
public class Divsible
 {
    public static void main (String args[])
    {
        //taking input from user
        int num;
        Scanner sc = new Scanner(System.in);

        //prompt user to enter a number
        System.out.println("Enter a number to check if it is divisible by 5 and 11: ");
        num=sc.nextInt();

        //conditon to check if the number is divisible by 5 and 11
        if(num%5==0 && num%11==0)
        {
            System.out.println("Number is divisible by both 5 and 11");
        }
        else
        {
            System.out.println("Number is not divisible by both 5 and 11");
        }
  }    
}
