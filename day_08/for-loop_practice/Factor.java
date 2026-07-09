import java.util.*;

public class Factor {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbe");
        int num = sc.nextInt();

        // logic for print the factors of the given number

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {

                System.out.print(i);
            }
        }

    }
}