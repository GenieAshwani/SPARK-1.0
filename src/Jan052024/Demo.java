package Jan052024;


class Test
{
    Test() {
        super();
        System.out.println("Main test hu..........");
    }
}
public class Demo extends Test{

    int a;
    Demo()
    {
        this(10); /// calling parent class constructor
        System.out.println("Child..........");

    }

    public Demo(int i) {
        super();
        System.out.println("Arg........... ");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();

    }
}
