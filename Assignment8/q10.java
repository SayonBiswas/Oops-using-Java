import java.util.Scanner;

class SumTask extends Thread{
    private int start, end;
    private static int sum = 0;

    public SumTask(int start, int end){
        this.start = start;
        this.end = end;
    }

    private static synchronized void addToSum(int value){
        sum += value;
    }

    public void run(){
        int localSum = 0;
        for (int i = start; i <= end; i++) {
            localSum += i;
        }
        addToSum(localSum);
    }

    public static int getSum(){
        return sum;
    }
}

class SynchronizedMain{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter number of threads: ");
        int m = sc.nextInt();

        SumTask[] threads = new SumTask[m];

        int range = n / m;
        int start = 1;

        for (int i = 0; i < m; i++) {
            int end = (i == m - 1) ? n : (start + range - 1);
            threads[i] = new SumTask(start, end);
            threads[i].start();
            start = end + 1;
        }

        for (int i = 0; i < m; i++) {
            threads[i].join();
        }

        System.out.println("Sum of first " + n + " natural numbers = " + SumTask.getSum());
        sc.close();
    }
}
