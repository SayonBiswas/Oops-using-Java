import java.util.Scanner;

class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        String words[] = s.split(" ");
        String ans = "";

        for(String w : words) {
            ans += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }

        System.out.println(ans);
        sc.close();
    }
}
