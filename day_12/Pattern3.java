import java.util.*;
public class Pattern3
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
            for(int j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
            System.out.print("*");
            }
             
            System.out.println();
        }
    }
}

   