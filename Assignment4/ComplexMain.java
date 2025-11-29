import java.util.Scanner;

class Complex{
	private double real;
	private double imaginary;
	
	public void initialise(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the real part: ");
		real = sc.nextDouble();
		System.out.print("Enter the imaginary part: ");
		imaginary = sc.nextDouble();
		sc.close();
	}
	
	public void show(){
		if(imaginary >= 0){
			System.out.println(real + " + " + imaginary + "i");
		}
		else{
			System.out.println(real + " + " + Math.abs(imaginary) + "i");
		}
	}
	
	public Complex add(Complex c){
		Complex sum = new Complex();
		sum.real = this.real + c.real;
		sum.imaginary = this.imaginary + c.imaginary;
		return sum;
	}
}

class ComplexMain{
	public static void main(String args[]){
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		
		System.out.println("Enter the first complex number");
		c1.initialise();
		System.out.println("Enter the second complex number");
		c2.initialise();
		
		System.out.print("\nFirst Complex Number: ");
		c1.show();
		System.out.print("Second Complex Number: ");
		c2.show();
		
		Complex result = c1.add(c2);
		System.out.print("\nSum of two complex numbers: ");
		result.show();
	}
}