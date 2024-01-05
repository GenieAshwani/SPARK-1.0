package Jan052024;

 class Parent {

    String name;

    Parent(String n)
    {
        name=n;
    }

}

public class Child extends Parent{

     String name;

    Child(String n1,String n2) {
        super(n1);
        this.name=n2;
    }
    void print()
    {
        System.out.println(super.name+"  " +name);
    }

    public static void main(String[] args) {
        Child child=new Child("Parent","Child");
        child.print();
    }
}
