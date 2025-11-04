import java.util.Scanner;

abstract class Shape{
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

class Area extends Shape{
    public void RectangleArea(double length, double breadth){
        System.out.println("Area of Rectangle with length: " + length + " and breadth: " + breadth + " is " + length * breadth);
    }
    public void SquareArea(double side){
        System.out.println("Area of Square with side: " + side + " is " + side * side);
    }
    public void CircleArea(double radius){
        System.out.println("Area of Circle with radius: " + radius + " is " + Math.PI * radius * radius);
    }
}

class AreaMain{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        Shape s = new Area();

        System.out.print("Enter the length and breadth of rectangle: ");
        double len = sc.nextDouble();
        double bre = sc.nextDouble();

        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println();

        s.RectangleArea(len, bre);
        System.out.println();

        s.SquareArea(side);
        System.out.println();

        s.CircleArea(radius);
        System.out.println();

        sc.close();
    }
}