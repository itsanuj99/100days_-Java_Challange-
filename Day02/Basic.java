import java.util.Scanner;
public class Basic {
    public static void main (String []args)
    {
int a;
int b;
Scanner sc= new Scanner(System.in);
System.out.println("---------Opertors in Java---------");
 
// taking inpur the value of A 
System.out.println("Enter the value of A ");
a=sc.nextInt();

// taking input the value of B 
System.out.println("Enter the value of B ");
b=sc.nextInt();

// Arithmatic Operators
System.out.println("----------Arithmatic Operators----------");

// Addition
System.out.println("The Addition of A and B is "+(a+b));

// Subtraction
System.out.println("The Subtraction of A and B is "+(a-b));     

// Multiplication
System.out.println("The Multiplication of A and B is "+(a*b));

// Division
System.out.println("The Division of A and B is "+(a/b));

// Modulus
System.out.println("The Modulus of A and B is "+(a%b));
    }
}
