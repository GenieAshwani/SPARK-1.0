package Dec292023;

public class StaticVariableDemo {

    static int a=10;
    public static void main(String[] args) {

        StaticVariableDemo obj = new StaticVariableDemo();
        System.out.println(obj.a); //10
        obj.a=100; //100
        System.out.println(obj.a); //100

        StaticVariableDemo obj1 = new StaticVariableDemo();
        obj1.a=333;
        System.out.println(obj1.a);

        System.out.println(obj.a);
    }

    public void demo()
    {
        System.out.println(StaticVariableDemo.a);
    }
}

class B{
    public void demo()
    {
        System.out.println(StaticVariableDemo.a);
    }
}
