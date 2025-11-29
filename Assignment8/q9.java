import java.util.Scanner;

class EvenThread extends Thread{
    private int[] a, b, result;

    public EvenThread(int[] a, int[] b, int[] result){
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public void run(){
        for (int i = 0; i < a.length; i += 2){
            result[i] = a[i] * b[i];
        }
    }
}

class OddThread extends Thread{
    private int[] a, b, result;

    public OddThread(int[] a, int[] b, int[] result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public void run(){
        for (int i = 1; i < a.length; i += 2){
            result[i] = a[i] * b[i];
        }
    }
}

class ArrayThreadMain{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] result = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }

        EvenThread t1 = new EvenThread(arr1, arr2, result);
        OddThread t2 = new OddThread(arr1, arr2, result);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Resultant Product Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}
