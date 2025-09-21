import java.util.Scanner;

class Employee{
	public int empid;
	public String ename;
	public String dept;
	public double sal;
	
	public void getData(Scanner sc){
		System.out.print("Enter employee id: ");
		empid = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter employee name: ");
		ename = sc.nextLine();
		System.out.print("Enter employee department: ");
		dept = sc.nextLine();
		System.out.print("Enter employee salary: ");
		sal = sc.nextDouble();
	}
	
	public void putData(){
		System.out.println("--------------------------------");
		System.out.println("Employee ID: " + empid);
		System.out.println("Employee Name: " + ename);
		System.out.println("Department: " + dept);
		System.out.println("Salary: " + sal);
	}
}

class EmployeeMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		Employee []employees = new Employee[n];
		
		for(int i = 0; i < n; i++){
			System.out.println("Enter employee details");
			employees[i] = new Employee();
			employees[i].getData(sc);
		}
		
		System.out.println("\n----Employee Details----");
		for(Employee emp:employees){
			emp.putData();
		}
	}
}