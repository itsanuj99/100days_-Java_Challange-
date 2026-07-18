import java.util.*;
public class Array {
    public static void main(String[] args) {
        // taking user input
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // entering the size of the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            // reading the size of the array
            arr[i] = sc.nextInt();
        }

        System.out.println("  Arrya is ");
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i]+" ");

        }

    }
}