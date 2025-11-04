import java.util.Scanner;

interface Calculator{
    double add(double a, double b);
    double sub(double a, double b);
    double mul(double a, double b);
    double div(double a, double b);
}

class DemoCalculator implements Calculator{
    public double add(double a, double b){
        return a + b;
    }
    public double sub(double a, double b){
        return a - b;
    }
    public double mul(double a, double b){
        return a * b;
    }
    public double div(double a, double b){
        if(b == 0){
            return -1;
        }
        else{
            return a / b;
        }
    }
}

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        DemoCalculator dc = new DemoCalculator();
        
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + dc.add(num1, num2));
        System.out.println("Difference of " + num1 + " and " + num2 + " is " + dc.sub(num1, num2));
        System.out.println("Product of " + num1 + " and " + num2 + " is " + dc.mul(num1, num2));

        double result = dc.div(num1, num2);
        if(result == -1){
            System.out.println("Division by zero is not possible");
        }
        else{
            System.out.println("Quotient of " + num1 + " and " + num2 + " is " + result);
        }
        sc.close();
    }
}