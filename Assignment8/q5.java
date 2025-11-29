import java.util.Scanner;

class OddThread extends Thread{
    private int m, n;

    public OddThread(int m, int n){
        this.m = m;
        this.n = n;
    }

    public void run() {
        System.out.println("Odd numbers:");
        for (int i = m; i <= n; i++){
            if (i % 2 != 0){
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }
}

class OddMain{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting range: ");
        int m = sc.nextInt();

        System.out.print("Enter ending range: ");
        int n = sc.nextInt();

        OddThread odd = new OddThread(m, n);
        odd.start();

        System.out.println("Even numbers:");
        for (int i = m; i <= n; i++){
            if (i % 2 == 0){
                System.out.print(i + "\t");
            }
        }

        System.out.println();
        sc.close();
    }
}
