import java.util.*;
public  class Sum
{
    public static void main (String args[])
    {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

        System.out.println("The Natural numbers are : ");
        for(int i=1;i<=num;i++)
        {
             sum+=i;
       System.out.println(i);
        }
       System.out.print("The sum of the First " +num+ " natural number is : " +sum);
        
    }
}
