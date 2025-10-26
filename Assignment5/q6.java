abstract class Bank{
    abstract float getRateOfInterest();
}

class SBI extends Bank{
    public float getRateOfInterest(){
        return 8.0f;
    }
}

class ICICI extends Bank{
    public float getRateOfInterest(){
        return 7.0f;
    }
}

class AXIS extends Bank{
    public float getRateOfInterest(){
        return 9.0f;
    }
}

class BankMain{
    public static void main(String args[]){
        Bank b;

        b = new SBI();
        System.out.println("SBI Interest Rate is " + b.getRateOfInterest());

        b = new ICICI();
        System.out.println("ICICI Interest Rate is " + b.getRateOfInterest());

        b = new AXIS();
        System.out.println("AXIS Interet Rate is " + b.getRateOfInterest());
    }
}