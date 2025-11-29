import java.util.Scanner;

class MinThread extends Thread{
    int[] arr;
    int start, end;
    static int globalMin = Integer.MAX_VALUE;

    MinThread(int[] arr, int start, int end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public void run(){
        int localMin = Integer.MAX_VALUE;

        for (int i = start; i <= end; i++){
            if (arr[i] < localMin)
                localMin = arr[i];
        }

        synchronized (MinThread.class) {
            if (localMin < globalMin)
                globalMin = localMin;
        }
    }
}

class MinMain {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of threads: ");
        int m = sc.nextInt();

        MinThread[] t = new MinThread[m];

        int size = n / m;

        for (int i = 0; i < m; i++) {
            int start = i * size;
            int end = (i == m - 1) ? (n - 1) : (start + size - 1);

            t[i] = new MinThread(arr, start, end);
            t[i].start();
        }

        for (int i = 0; i < m; i++)
            t[i].join();

        System.out.println("Minimum element = " + MinThread.globalMin);
        sc.close();
    }
}
