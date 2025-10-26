import java.util.Scanner;
class Figure{
    double dim1;
    double dim2;
    Figure(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public double area(){
        return dim1 * dim2;
    }
}

class Rectangle extends Figure{
    Rectangle(double length, double breadth){
        super(length, breadth);
    }
    @Override
    public double area(){
        return dim1 * dim2;
    }
}

class Triangle extends Figure{
    Triangle(double base, double height){
        super(base, height);
    }
    @Override
    public double area(){
        return (dim1 * dim2) / 2;
    }
}

class Square extends Figure{
    Square(double side){
        super(side, side);
    }
    @Override
    public double area(){
        return dim1 * dim2;
    }
}

class FigureMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Figure f;

        System.out.print("Enter the length and breadth of rectangle: ");
        double len = sc.nextDouble();
        double bre = sc.nextDouble();

        System.out.print("Enter the base and height of the Triangle: ");
        double base = sc.nextDouble();
        double hei = sc.nextDouble();

        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();

        System.out.println();

        f = new Rectangle(len, bre);
        System.out.println("Area of rectangle is " + f.area());

        f = new Triangle(base, hei);
        System.out.println("Area of triangle is " + f.area());

        f = new Square(side);
        System.out.println("Area of the square is " + f.area());

        sc.close();
    }
}