import java.util.Scanner;

// Thread class to check palindrome
class PalindromeThread extends Thread {
    private int num;

    public PalindromeThread(int num) {
        this.num = num;
    }

    public void run() {
        int temp = num;
        int rev = 0;

        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }

        if (rev == num)
            System.out.println(num + " is a Palindrome number.");
        else
            System.out.println(num + " is NOT a Palindrome number.");
    }
}

class PalindromeMain {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Start child thread (palindrome check)
        PalindromeThread pt = new PalindromeThread(n);
        pt.start();

        // Main thread task → prime/composite check
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;   // 0 & 1 are neither prime nor composite
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (n <= 1) {
            System.out.println(n + " is neither Prime nor Composite.");
        } else if (isPrime) {
            System.out.println(n + " is a Prime number.");
        } else {
            System.out.println(n + " is a Composite number.");
        }
        sc.close();
    }
}
