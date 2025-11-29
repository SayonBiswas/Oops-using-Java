import java.util.Scanner;

class TableThread extends Thread {
    private int num;

    public TableThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

class FactorialThread extends Thread {
    private int num;

    public FactorialThread(int num) {
        this.num = num;
    }

    public void run() {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " = " + fact);
    }
}

class TwoThreadMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        TableThread t1 = new TableThread(n);
        FactorialThread t2 = new FactorialThread(n);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        sc.close();
    }
}
