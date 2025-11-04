
import btech.Student;
import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter roll no: ");
        int roll_no = sc.nextInt();
        System.out.println("Enter the marks of 3 subjects: ");
        double marks1 = sc.nextDouble();
        double marks2 = sc.nextDouble();
        double marks3 = sc.nextDouble();

        Student s = new Student(name, roll_no, marks1, marks2, marks3);
        s.display();

        sc.close();
    }
}