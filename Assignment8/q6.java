import java.util.Scanner;

class SquareThread extends Thread {
    private int num;

    public SquareThread(int num) {
        this.num = num;
    }

    public void run() {
        int square = num * num;
        System.out.println("Square of " + num + " = " + square);
    }
}

class SumThread extends Thread {
    private int num;

    public SumThread(int num) {
        this.num = num;
    }

    public void run() {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits of " + num + " = " + sum);
    }
}

class OperationMain{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        SquareThread st = new SquareThread(n);
        SumThread sm = new SumThread(n);

        st.start();
        sm.start();
        sc.close();
    }
}
