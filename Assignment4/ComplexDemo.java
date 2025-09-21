import java.util.Scanner;

class ComplexNum{
    private double real;
    private double img;

    public ComplexNum(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public void displayCompNumber() {
        if (img >= 0){
            System.out.println(real + " + " + img + " i ");
		}
        else{
            System.out.println(real + " - " + Math.abs(img) + " i ");
		}
    }

    public ComplexNum addCompNumber(ComplexNum c) {
        double r = this.real + c.real;
        double i = this.img + c.img;
        return new ComplexNum(r, i);
    }
}

class ComplexDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();

        ComplexNum c1 = new ComplexNum(r1, i1);
        ComplexNum c2 = new ComplexNum(r2, i2);

        System.out.print("First Complex Number: ");
        c1.displayCompNumber();

        System.out.print("Second Complex Number: ");
        c2.displayCompNumber();

        ComplexNum sum = c1.addCompNumber(c2);
        System.out.print("Sum of the two Complex Numbers: ");
        sum.displayCompNumber();
    }
}
