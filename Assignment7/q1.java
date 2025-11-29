import java.util.Scanner;

class Question1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();

        while (true) {
            try {
                System.out.print("Enter denominator: ");
                int denominator = sc.nextInt();
                System.out.println("Result of " + numerator + "/" + denominator + " is: " + numerator / denominator);
                return;
            } catch (ArithmeticException e) {
                System.out.println("Denominator cannot be zero, Enter again...");
            }
        }
    }
}