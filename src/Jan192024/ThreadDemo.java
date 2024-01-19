package Jan192024;


/*class Demo extends Thread
{
    @Override
    public void run() {
        //job
        for (int i = 0; i < 10; i++) {
            System.out.println("Jai Shri Ram...");
        }
    }
}*/
class Demo implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Jai Shri Ram...");
        }
    }
}


public class ThreadDemo {

    public static void main(String[] args) {
        /*Demo d=new Demo();
        d.start();*/

       /* Demo d=new Demo();
        Thread t1=new Thread(d);
        t1.start();*/


        for (int i = 0; i < 10; i++) {
            System.out.println("Main");
        }
    }
}
