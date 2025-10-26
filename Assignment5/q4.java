import java.util.Scanner;

abstract class Figure {
    double dim1, dim2;

    Figure(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    abstract double getArea();
}

class Rectangle extends Figure {
    Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    @Override
    double getArea() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    double getArea() {
        return 0.5 * dim1 * dim2;
    }
}

class FigureTest {
    public static void main(String[] args){
        Figure fig;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length and breadth of the rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        System.out.print("Enter the base and height of the triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        fig = new Rectangle(length, breadth);
        System.out.println("Area of Rectangle: " + fig.getArea());

        fig = new Triangle(base, height);
        System.out.println("Area of Triangle: " + fig.getArea());

        sc.close();
    }
}