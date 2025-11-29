import java.util.InputMismatchException;
import java.util.Scanner;

class Question6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter the length in feet and inches: ");
                int feet = sc.nextInt();
                int inches = sc.nextInt();

                if (feet < 0.0 || inches < 0.0) {
                    throw new IllegalArgumentException();
                }
                double centimeter = (feet * 12 + inches) * 2.54;
                System.out.println("Equivalent length in centimeters: " + centimeter);
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid number containing digits");
            } catch (IllegalArgumentException e) {
                System.out.println("Negative value(s) was/were entered. Try again...");
            }
        }
    }
}