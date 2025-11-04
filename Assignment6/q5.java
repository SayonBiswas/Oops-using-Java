interface Servicing{
    abstract void getServiceTime();
}

class Car implements Servicing{
    public void getServiceTime(){
        System.out.println("Service time for car is 3 hours");
    }
}

class Bike implements Servicing{
    public void getServiceTime(){
        System.out.println("Service time for bike is 1 hour");
    }
}

class ServicingMain{
    public static void main(String args[]){
        Servicing s;

        s = new Car();
        s.getServiceTime();
        System.out.println();

        s = new Bike();
        s.getServiceTime();
        System.out.println();
    }
}