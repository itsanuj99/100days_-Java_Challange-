import java.util.*;
public class Febonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        int i=1;
        do{
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
            i++;
        }
        while(i<=n);
    }
    
}
