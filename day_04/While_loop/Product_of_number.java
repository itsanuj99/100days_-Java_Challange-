import java.util.*;
public class Product_of_number {
    public static void main(String[] args) {
        int n;
        int product =1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();

        //product of the digit
        int r;
        while(n>0)
        {
            r=n%10;
            product= product*r;
            n=n/10;
        }
        System.out.println(product);
    }
}
