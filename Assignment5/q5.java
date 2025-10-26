import java.util.Scanner;

class Point2D{
    double x;
    double y;
    Point2D(){
        x = y = 0.0;
    }
    Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void display(){
        System.out.println("2D point coordinates is (" + x + ", " + y + ")");
    }
}

class Point3D extends Point2D{
    double z;
    Point3D(){
        super();
        z = 0.0;
    }
    Point3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }
    public void display(){
        System.out.println("3D point coordinates is (" + x + ", " + y + ", " + z + ")");
    }
}

class PointMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Point2D p1 = new Point2D();
        p1.display();
        System.out.println();

        Point3D p2 = new Point3D();
        p2.display();
        System.out.println();

        System.out.print("Enter the x-coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter the y-coordinate: ");
        double y = sc.nextDouble();
        System.out.print("Enter the z-coordinate: ");
        double z = sc.nextDouble();
        System.out.println();

        Point2D p3 = new Point2D(x, y);
        p3.display();
        System.out.println();

        Point3D p4 = new Point3D(x, y, z);
        p4.display();
        sc.close();
    }
}