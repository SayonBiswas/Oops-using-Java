import java.util.Scanner;

class Point{
    private double xCo;
    private double yCo;

    public Point(double xCo, double yCo) {
        this.xCo = xCo;
        this.yCo = yCo;
    }

    public double distanceBetPoints(Point p) {
        double dx = this.xCo - p.xCo;
        double dy = this.yCo - p.yCo;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

class PointMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x-coordinate of first point: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y-coordinate of first point: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x-coordinate of second point: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y-coordinate of second point: ");
        double y2 = sc.nextDouble();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        double distance = p1.distanceBetPoints(p2);
        System.out.println("Distance between the two points: " + distance);
        sc.close();
    }
}
