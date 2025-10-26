class Shape{
    public void draw(){
        System.out.println("Drawing shape");
    }
    public void erase(){
        System.out.println("Erasing shape");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing circle");
    }
    public void erase(){
        System.out.println("Erasing circle");
    }
}

class Triangle extends Shape{
    public void draw(){
        System.out.println("Drawing triangle");
    }
    public void erase(){
        System.out.println("Erasing triangle");
    }
}

class Square extends Shape{
    public void draw(){
        System.out.println("Drawing square");
    }
    public void erase(){
        System.out.println("Erasing square");
    }
}

class ShapeMain{
    public static void main(String args[]){
        Shape s;

        s = new Circle();
        s.draw();
        s.erase();
        System.out.println();

        s = new Square();
        s.draw();
        s.erase();
        System.out.println();

        s = new Triangle();
        s.draw();
        s.erase();
        System.out.println();
    }
}