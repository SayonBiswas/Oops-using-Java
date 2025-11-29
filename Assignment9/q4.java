import java.util.Scanner;

class q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Characters = " + s.length());
        sc.close();
    }
}
