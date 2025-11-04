abstract class Bank{
    abstract void getROI();
}

class SBI extends Bank{
    public void getROI(){
        System.out.println("SBI Rate of Interest is 9.0");
    }
}

class PNB extends Bank{
    public void getROI(){
        System.out.println("PNB Rate of Interest is 8.0");
    }
}

class BOI extends Bank{
    public void getROI(){
        System.out.println("BOI Rate of Interest is 7.0");
    }
}

class BankMain{
    public static void main(String args[]){
        Bank b;

        b = new SBI();
        b.getROI();
        System.out.println();

        b = new PNB();
        b.getROI();
        System.out.println();

        b = new BOI();
        b.getROI();
    }
}