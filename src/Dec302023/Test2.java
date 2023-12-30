package Dec302023;

 class Shape {
    void draw()
    {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}


public class Test2{

    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.draw();
        Circle circle=new Circle();
        circle.draw();;
        Rectangle rectangle=new Rectangle();
        rectangle.draw();

        Shape shape1=new Circle();
        Shape shape2=new Rectangle();
        shape1.draw();
        shape2.draw();

        //Circle circle1=new Shape();
    }
}
