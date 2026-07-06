 import java.util.*;
 public class Count
 {
    public  static void main(String args[])
    {
        int n;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();

        do{
            count++;
            n=n/10;
        }
        while(n!=0);
        System.out.println(count);
    }
 }