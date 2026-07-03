import java.util.*;
public class Perimeter {
    public static void main(String[] args) 
    {
        System.out.println("----------Perimeter----------");
    Scanner sc = new Scanner(System.in);
    
// perimenter  of rectangle 

    System.out.println("Enter the LEngth of the Rectangle "); // input lenght of the rectangle
    int Length =sc.nextInt();

    System.out.println("Enter the Breadth of the Rectangle "); // input breadth of the rectangle
    int Breadth =sc.nextInt();

    int Perimeter = 2*(Length + Breadth); // formula of perimeter of rectangle  
    System.out.println("The perimeter of the rectangle is: " + Perimeter);      
    }
}
