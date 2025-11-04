interface One{
    void show1();
}

interface Two{
    void show2();
}

class Display implements One, Two{
    public void show1(){
        System.out.println("This is Interface One block");
    }
    public void show2(){
        System.out.println("This is Interface Two block");
    }
}

class MultipleInheritance{
    public static void main(String args[]){
        Display d = new Display();
        d.show1();
        d.show2();
    }
}