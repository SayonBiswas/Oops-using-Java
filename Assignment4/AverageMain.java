import java.util.Scanner;

class Average{
	public void calculate(double num1, double num2, double num3){
		double avg = (num1 + num2 + num3) / 3;
		System.out.println("The average of three numbers is " + avg);
	}
}

class AverageMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double no1 = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double no2 = sc.nextDouble();
		System.out.print("Enter the third number: ");
		double no3 = sc.nextDouble();
		
		Average result = new Average();
		result.calculate(no1, no2, no3);
		sc.close();
	}
}