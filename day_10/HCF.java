import java.util.*;

public class HCF {
    public static void main(String args[]) {
        int smallerNumber;
        Scanner sc = new Scanner(System.in);

        // number Ist
        System.out.println("Enter  A number");
        int a = sc.nextInt();

        // number 2nd
        System.out.println("Enter B number");
        int b = sc.nextInt();

        int hcf = 1; // because every number has 1 as a common Factor

        // finding which is the smallest number between them

        if (a < b) {
            smallerNumber = a;

        } else {
            smallerNumber = b;
        }

        for (int i = 1; i <= smallerNumber; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }

        }
        System.out.println("The HCF of " + a + " and " + b + " is: " + hcf);
    }
}