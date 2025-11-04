import btech.arithmetic.MyMath;
import java.util.Scanner;

class ArithmeticTest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Addition: " + MyMath.add(num1, num2));
        System.out.println("Subtraction: " + MyMath.sub(num1, num2));
        System.out.println("Multiplication: " + MyMath.mul(num1, num2));
        System.out.println("Division: " + MyMath.div(num1, num2));
        System.out.println("Modulus: " + MyMath.mod(num1, num2));
        sc.close();
    }
}