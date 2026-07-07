import java.util.*;

public class Palindrome {
    public static void main(String args[]) {
        int num;
        int rev = 0;
        int rem;
        int orginal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        orginal=num;
            
        do {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;

        } while (num != 0);
        if (orginal == rev) {

            System.out.println("The number is palindrome");
        } else {

            System.out.println("The number is not a palindrome");
        }
    }
}
