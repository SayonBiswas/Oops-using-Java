package btech;

public class Student{
    String name;
    int roll_no;
    double sub1, sub2, sub3;
    public Student(String name, int roll_no, double sub1, double sub2, double sub3){
        this.name = name;
        this.roll_no = roll_no;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public double getTotal(){
        return sub1 + sub2 + sub3;
    }

    public double getPercentage(){
        return getTotal() / 3;
    }

    public void display(){
        System.out.println("Roll No.: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("------MARKS------");
        System.out.println("Sub 1: " + sub1);
        System.out.println("Sub 2: " + sub2);
        System.out.println("Sub 3: " + sub3);
        System.out.println("Total: " + getTotal());
        System.out.println("Percentage: " + getPercentage());
        System.out.println("------------------");
    }
}