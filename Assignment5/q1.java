import java.util.Scanner;

class Account{
	String Customer_Name;
	String Account_Number;
	public Account(String Customer_Name, String Account_Number){
		this.Customer_Name = Customer_Name;
		this.Account_Number = Account_Number;
	}
	public void display(){
		System.out.println("Customer Name: " + Customer_Name);
		System.out.println("Account Number: " + Account_Number);
	}
}

class Savings_Account extends Account{
	int min_bal;
	int saving_bal;
	public Savings_Account(String Customer_Name, String Account_Number, int min_bal, int saving_bal){
		super(Customer_Name, Account_Number);
		this.min_bal = min_bal;
		this.saving_bal = saving_bal;
	}
	public void show(){
		super.display();
		System.out.println("Minimum Balance: " + min_bal);
		System.out.println("Saving Balance: " + saving_bal);
	}
}

class Account_details extends Savings_Account{
	int deposit;
	int withdrawal;
	public Account_details(String Customer_Name, String Account_Number, int min_bal, int saving_bal, int deposit, int withdrawal){
		super(Customer_Name, Account_Number, min_bal, saving_bal);
		this.deposit = deposit;
		this.withdrawal = withdrawal;
	}
	public void show1(){
		super.show();
		System.out.println("Amount deposited: " + deposit);
		System.out.println("Amount withdrawed: " + withdrawal);
	}
}

class AccountMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the account number: ");
		String Acc_No = sc.nextLine();
		System.out.print("Enter the customer name: ");
		String Cus_Name = sc.nextLine();
		System.out.print("Enter minimum balance: ");
		int min = sc.nextInt();
		System.out.print("Enter saving balance: ");
		int saving = sc.nextInt();
		System.out.print("Enter the deposited amount: ");
		int deposit = sc.nextInt();
		System.out.print("Enter the amount withdrawed: ");
		int withdrawal = sc.nextInt();
		Account_details customer = new Account_details(Cus_Name, Acc_No, min, saving, deposit, withdrawal);
		System.out.println("\nAccount details:");
		customer.show1();

		sc.close();
	}
}