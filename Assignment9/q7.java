import java.util.Scanner;

class q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String 1: ");
        String a = sc.nextLine();

        System.out.print("String 2: ");
        String b = sc.nextLine();

        if(a.equals(b))
            System.out.println("Equal");
        else
            System.out.println("Not equal");
        sc.close();
    }
}
