import java.util.Scanner;

class Area{
	private double length;
	private double breadth;
	
	public void setDim(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public double getArea(){
		return this.length * this.breadth;
	}
}

class AreaMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the rectangle: ");
		double len = sc.nextDouble();
		System.out.print("Enter the breadth of the rectangle: ");
		double brd = sc.nextDouble();
		Area rect = new Area();
		rect.setDim(len, brd);
		double area =  rect.getArea();
		System.out.println("Area of the rectangle: " + area);
		sc.close();
	}
}