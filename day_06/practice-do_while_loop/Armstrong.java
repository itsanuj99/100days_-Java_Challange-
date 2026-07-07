import java.util.*;
public class Armstrong
{
    public static void main (String args[])
    {
        int num;
        int original;
        int rem;
        int Arm=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        original= num; // copying the num variable value to original.

        do{
            rem=num%10;
            Arm= Arm+(rem*rem*rem);
            num=num/10;
        }
        while(num!=0);
        if(original==Arm)
        {
            System.out.println(Arm + "Number is an Armstrong number");
        }
        else{
            System.out.println(Arm + "Number is not an Armstrong number");
        }
    }
}