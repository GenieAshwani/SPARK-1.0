package Jan112024;

public class ExceptionDemo3 {
    public static void main(String[] args) {

        System.out.println(print());
    }

    public static int print()
    {

        try {
            //System.exit(0);
            System.out.println(10/0);

            return 100;
        }
        catch (ArithmeticException e)
        {
            return 778;
        }
        finally {
            return 222;
        }
    }
}
