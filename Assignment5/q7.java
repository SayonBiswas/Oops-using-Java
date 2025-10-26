import java.util.Scanner;

class Person{
    String name;
    Person(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Name: " + name);
    }
}

class Employee extends Person{
    private int empid;
    Employee(String name, int empid){
        super(name);
        this.empid = empid;
    }
    public void display(){
        super.display();
        System.out.println("EmpID: " + empid);
    }
}

class HourlyEmployee extends Employee{
    private double hourlyRate;
    private double hoursWorked;
    HourlyEmployee(String name, int empid, double hourlyRate, double hoursWorked){
        super(name, empid);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    double getGrossPay(){
        return hourlyRate * hoursWorked;
    }
    public void display(){
        super.display();
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: "+ hoursWorked);
        System.out.println("Gross Pay: " + getGrossPay());
    }
}

class PersonMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter the Employee ID: ");
        int empid = sc.nextInt();

        System.out.print("Enter the hourly rate: ");
        double hourlyRate = sc.nextDouble();

        System.out.print("Enter the hours worked: ");
        double hoursWorked = sc.nextDouble();

        System.out.println();
        HourlyEmployee emp = new HourlyEmployee(name, empid, hourlyRate, hoursWorked);
        emp.display();

        sc.close();
    }
}