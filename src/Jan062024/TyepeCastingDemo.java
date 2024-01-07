package Jan062024;

public class TyepeCastingDemo {




    public static void main(String[] args) {

        //Widening(implicit) casting
        int num =10;
        System.out.println("The int value  = "+ num);

        /* converting from int to double */
        double d =num;
        System.out.println("The double value = " + d);

        //Narrowing(explicit)

        double data = 10.55;
        System.out.println("The dubel value = "+data);

        //converting  double to int
        int intdata =(int)data;
        System.out.println("The int data = "+intdata);


    }
}
