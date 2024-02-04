package Feb.Feb042024;


import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        /*Predicate<String> P=(s)->s.length()>0;
        boolean genei = P.test("Genei");
        System.out.println(genei);*/

        int arr[]={2,3,4,5,6,7,8,9,10};
        Predicate<Integer> p1=(arg)->arg%2==0; //even
        Predicate<Integer> p2=(arg)->arg%2!=0; //odd
        Predicate<Integer> p3=(arg)->arg>4; //odd
        //display(p1,arr);
       // display(p1,arr);
       // display(p1.and(p3),arr);
        display(p1.negate(),arr);
       // display(p1.or(p2),arr);

    }

    public static void display(Predicate<Integer> predicate,int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(predicate.test(arr[i]))
            {
                System.out.println(arr[i]);
            }
        }
    }
}
