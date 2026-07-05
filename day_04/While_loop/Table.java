import java.util.*;
public class Table {
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to print  the tbale");
        n=sc.nextInt();

        // table printing 
        for(int i=1;i<=10;i++)
        {
            System.out.println(n + "X" + i + "=" + n*i);
        }
        
    }

    
}
