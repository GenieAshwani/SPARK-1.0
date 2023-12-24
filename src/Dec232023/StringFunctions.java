package Dec232023;

import java.util.Arrays;

public class StringFunctions {
    public static void main(String[] args) {

        //length
        String s="ashwani genie";
        System.out.println(s.length());

        //concatention
        String s1="ashwnai";
        String s2="upadhyay";
        String s3 = s1+s2;
        System.out.println(s3);

        //toCharArray()
        String s4 ="Ashwani";
        char arr[]= s4.toCharArray();
        System.out.println("to char array = "+ Arrays.toString(arr));

        //charAt()
        String s11="leela";
        System.out.println("chart at = "+s11.charAt(1));

        //compareTo()

        String s12="hello";
        String s13="hello";

       int res = s12.compareTo(s13);
        System.out.println(res);

        //== refernce com equals()

        System.out.println(s12.equals(s13));

        //contains()
        String s15="hello ashwani welcome to the development batch spark 1.0";
        System.out.println(s15.contains("ashwani"));
        System.out.println(s15.contains("Deep"));
     




        //indexOf()
        System.out.println(s15.indexOf('a'));

        //replace()\
        String ss="hello world";
        String res1=ss.replace("hello","ashwani");
        System.out.println(res1);

        //subString()
        String r1="hello ashwani welcome to the development batch spark 1.0";
        String r2= r1.substring(0,7); //o --- end-1
        String r3= r1.substring(4);//o --- end-1

        System.out.println(r2);
        System.out.println(r3);

    }
}
