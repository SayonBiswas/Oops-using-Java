import java.util.Scanner;

class q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String n = sc.nextLine();

        String arr[] = n.split(" ");

        for(String x : arr) {
            System.out.print(Character.toUpperCase(x.charAt(0)) + ". ");
        }
        sc.close();
    }
}
