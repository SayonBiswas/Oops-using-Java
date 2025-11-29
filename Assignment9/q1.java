import java.util.Scanner;

class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String rev = "";
        for(int i = s.length()-1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        System.out.println("Reverse = " + rev);

        if(s.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
}
