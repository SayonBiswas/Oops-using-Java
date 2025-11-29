class FirstThread extends Thread{
    public void run(){
        System.out.println("First Thread Running...");
        System.out.println("First Thread Priority: " + this.getPriority());
    }
}

class SecondThread extends Thread{
    public void run(){
        System.out.println("Second Thread Running...");
        System.out.println("Second Thread Priority: " + this.getPriority());
    }
}

class PriorityMain{
    public static void main(String[] args){

        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();

        t1.setPriority(2);
        t2.setPriority(10);

        t1.start();
        t2.start();

        System.out.println("Priority of First Thread: " + t1.getPriority());
        System.out.println("Priority of Second Thread: " + t2.getPriority());
    }
}

