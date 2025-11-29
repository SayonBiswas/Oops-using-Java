import java.util.Scanner;

class Student{
	String regNo;
	String stdName;
	String branch;
	double CGPA;
	
	public void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Registration number: ");
		regNo = sc.nextLine();
		System.out.print("Enter Student name: ");
		stdName = sc.nextLine();
		System.out.print("Enter Branch: ");
		branch = sc.nextLine();
		System.out.print("Enter the CGPA: ");
		CGPA = sc.nextDouble();
		sc.close();
	}
	
	public void display(){
		System.out.println("Registration Number: " + regNo);
		System.out.println("Student Name: " + stdName);
		System.out.println("Branch: " + branch);
		System.out.println("CGPA: " + CGPA);
	}
}

class StudentDetails{
	public static void main(String args[]){
		Student []students = new Student[5];
			
		System.out.println("Enter the details of 5 students");
		for(int i = 0; i < 5; i++){
			System.out.println("Student " + (i + 1) + ": ");
			students[i] = new Student();
			students[i].accept();
		}
			
		Student highest = students[0];
		for(int i = 1; i < 5; i++){
			if(students[i].CGPA > highest.CGPA){
				highest = students[i];
			}
		}
		System.out.println();
		
		System.out.println("Student details with highest CGPA is");
		highest.display();
		System.out.println();
	}
}