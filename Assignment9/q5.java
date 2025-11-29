import java.util.Scanner;

class q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Main string: ");
        String m = sc.nextLine();

        System.out.print("Find: ");
        String f = sc.nextLine();

        System.out.print("Replace with: ");
        String r = sc.nextLine();

        System.out.println(m.replace(f, r));
        sc.close();
    }
}
