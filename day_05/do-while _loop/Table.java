import java.util.*;
 class Table
 {
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        int i=1;
        do{
           System.out.println(n + "x" + i + "=" +n*i);
            i++;
        }
        while(i<=10);
    }
 }