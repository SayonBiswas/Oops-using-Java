import java.util.Scanner;

import java.util.Scanner;

class Box{
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double volume() {
        return this.width * this.height * this.depth;
    }
}

class BoxMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width of the box: ");
        double w = sc.nextDouble();

        System.out.print("Enter height of the box: ");
        double h = sc.nextDouble();

        System.out.print("Enter depth of the box: ");
        double d = sc.nextDouble();

        Box myBox = new Box(w, h, d);

        System.out.println("Volume of the box: " + myBox.volume());
    }
}
