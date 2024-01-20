package Jan202024;

class MyDemoThread extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            //yield is used to give up the cpu temp
           Thread.yield();

            try {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println("Child Thread Job..."+i);
        }
    }
}


public class YieldDemo {
    public static void main(String[] args) {
        MyDemoThread t1=new MyDemoThread();
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread..."+i);
        }

    }
}
