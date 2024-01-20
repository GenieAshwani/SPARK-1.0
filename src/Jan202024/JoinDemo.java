package Jan202024;

class MyThread3 extends Thread
{
     Thread t1;
     MyThread3(Thread t1)
     {
         this.t1=t1;
     }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            try {
                t1.join();  //executed by MyThread3
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println("MyThread3 Thread Starting...");
        }
    }
}

class DemoThread2 extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread Starting...");
            try {
                Thread.sleep(5000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException{
        DemoThread2 t1=new DemoThread2();
        MyThread3 t2=new MyThread3(t1);
        t1.start();
        t2.start();
       t2.join(); ///exceuted by main  thread
        //t2.interrupt();
        for (int i = 0; i <5 ; i++) {
            System.out.println("Main Thread");
        }
    }
}
