import java.util.Scanner;

class Question2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        try {
            if (x - y == 0) {
                throw new ArithmeticException("Division by zero occurred");
            } else {
                System.out.printf("Result: %d/(%d-%d) is: %d\n", x, x, y, x / (x - y));
            }
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}