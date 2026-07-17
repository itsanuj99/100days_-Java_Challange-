import java.util.*;
public class Pattern1
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // enter row
        System.out.println("Enter the row");
        int row=sc.nextInt();

        //enter coloumn
        System.out.println("Enter the coloumn");
        int coloumn=sc.nextInt();

        for(int i=0;i<=row;i++)
        {
            for(int j=0;j<=coloumn;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
             
        }
    }
}