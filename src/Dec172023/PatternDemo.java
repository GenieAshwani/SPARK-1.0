package Dec172023;

public class PatternDemo {

    /*

    *
    * *
    * * *
    * * * *
    * * * * *

     */

    public static void main(String[] args) {

        int rows =5;
        for (int i = 1; i <= rows; i++) {

            for (int j=1 ;j<=i ;j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("---------------------------------");

        /*
        * * * * *
        * * * *
        * * *
        * *
        *


         */



        for (int i = rows; i >= 1; i--) {

            for (int j=1 ;j<=i ;j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");


        /*

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

         */

        for (int i = 1; i <= rows; i++) {

            for (int j=1 ;j<=i ;j++ )
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }


    }




}
