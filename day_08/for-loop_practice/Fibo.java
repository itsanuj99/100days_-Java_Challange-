import java.util.*;
public class Fibo
{
    public static void main(String[]args)
    {
        int a=0,b=1,c;
    

        Scanner sc= new Scanner (System.in);
        System.out.println("ENter a number");
        int num=sc.nextInt();

        for(int i=0;i<=num;i++)
            {
                c=a+b;
                a=b;
                b=c;
                System.out.println(a);
            }
            
        }
    }