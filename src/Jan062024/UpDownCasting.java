package Jan062024;


class Parent{

    void display()
    {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent{
    void display()
    {
        System.out.println("This is the Child class");
    }

}


public class UpDownCasting {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.display();


        p=(Parent) new Child(); //upcasting.
        p.display();

        Child c= (Child) p;  //downcasting
        c.display();

    }
}
