import java.util.Scanner;

class Question3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int[] array = new int[sc.nextInt()];
        System.out.print("Enter the index of the array to peek: ");
        int idx = sc.nextInt();

        try {
            System.out.println("The value at " + idx + " in the array is: " + array[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}