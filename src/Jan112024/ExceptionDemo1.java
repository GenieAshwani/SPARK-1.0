package Jan112024;

public class ExceptionDemo1 {

    public static void main(String[] args) {
        m1();
    }

    public static void m1()
    {
        System.out.println("Hello M1");
        m2();
        System.out.println("Bye M1");

    }

    public static void m2()
    {
        System.out.println("Hello M2");
        try{
            System.out.println("In try block");
            System.out.println(10/0);
            System.out.println("try block"); // line 22
        }
        catch (Exception e)
        {
            System.out.println("aao bhai exception");
            //e.printStackTrace(); // l+d+en
            //e.toString(); //en+des
           // System.out.println(e.toString());
            //e.getMessage(); //des
            //System.out.println(e.getMessage());




        }
        System.out.println("Bye M2");

    }
}
