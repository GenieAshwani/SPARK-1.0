package Feb.Feb042024;

@FunctionalInterface
interface Ankit
{
    public void m1();

    //override
    default void print()
    {
        System.out.println("default method");
    }

    //no override
    static void display()
    {
        System.out.println("static method");
    }

}

class MyThread implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Job = "+i);
        }
    }
}



public class FunctionalInterfaceDemo implements Ankit{
    public static void main(String[] args) {

        Ankit i=()-> System.out.println("Main hu ankit");

        Ankit.display();
        i.m1();

        //MyThread myThread=new MyThread();
        Thread thread=new Thread(()->{
            for (int j = 0; j < 5; j++) {
                System.out.println("Job = "+j);
            }
        });
        thread.start();
    }

    @Override
    public void m1() {

    }



}
