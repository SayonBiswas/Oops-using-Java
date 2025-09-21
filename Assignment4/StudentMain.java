import java.util.Scanner;

class Student{
	String name;
	int roll_no;
	String branch;
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name: ");
		name = sc.nextLine();
		System.out.print("Enter the roll no: ");
		roll_no = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the branch: ");
		branch = sc.nextLine();
	}
	
	public void display(){
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + roll_no);
		System.out.println("Branch: " + branch);
	}
}

class StudentMain{
	public static void main(String args[]){
		Student data = new Student();
		System.out.println("Enter the student details\n");
		data.input();
		System.out.println();
		System.out.println("The details of the student is");
		data.display();
	}
}