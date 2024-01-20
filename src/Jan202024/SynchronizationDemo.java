package Jan202024;

class PrintMsg
{
    public  void m1()
    {
        for (int i = 0; i < 5; i++) {


            synchronized (this)
            {
                System.out.println("Executed by "+Thread.currentThread().getName());
                System.out.println("Hello Ashwani...");
            }
            try {
                Thread.sleep(100);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println("By Ashwani..."+Thread.currentThread().getName());
        }
    }
}

class SynThreadDemo extends Thread
{
    PrintMsg p;
    SynThreadDemo(PrintMsg p)
    {
        this.p=p;
    }
    @Override
    public void run() {
        p.m1();
    }
}

public class SynchronizationDemo {

    public static void main(String[] args) {
        PrintMsg p=new PrintMsg();
        SynThreadDemo t1=new SynThreadDemo(p);
        SynThreadDemo t2=new SynThreadDemo(p);
        t1.setName("Ye Hai T1");
        t2.setName("Ye Hai T2");
        t1.start();
        t2.start();

    }
}
