import java.util.Scanner;

class ArmstrongChecker implements Runnable{
    private int num;

    public ArmstrongChecker(int num) {
        this.num = num;
    }

    public void run() {
        int temp = num;
        int original = num;

        int digits = 0;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = num;
        int sum = 0;

        while (temp > 0) {
            int r = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= r;
            }

            sum += power;
            temp /= 10;
        }

        // Step 3: Compare
        if (sum == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is NOT an Armstrong number.");
    }
}

class ArmstrongMain{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Create Runnable object
        ArmstrongChecker checker = new ArmstrongChecker(n);

        // Create and start thread
        Thread t = new Thread(checker);
        t.start();

        sc.close();
    }
}
