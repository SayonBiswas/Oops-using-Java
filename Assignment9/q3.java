import java.util.Scanner;

class q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println(s.toUpperCase());
        sc.close();
    }
}
