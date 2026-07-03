import java.util.Scanner;
public class Area {
    public static void main(String[] args) 
    {
        System.out.println("----------Area----------");

        Scanner sc = new Scanner(System.in);
        
        // area of Triangle
        System.out.println("Enter the base of the Triangle "); // input base of the triangle
        int base = sc.nextInt();
        System.out.println("Enter the height of the Triangle "); // input height of the triangle
        int height = sc.nextInt();
        double area = 0.5 * base * height; // formula of area of triangle
        System.out.println("The area of the triangle is: " + area);
    }       
}
