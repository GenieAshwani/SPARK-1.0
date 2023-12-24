package Dec172023;

public class ArrayDemo {

    public static void main(String[] args) {

        int ar[]= new int[10];  // init dec

        for (int i = 0; i < 10; i++)
        {
            ar[i]=i;  //setting value of array through loop
            //ar[0] = 0
            //ar[1] = 1
        }

        for(int a :ar)
        {
            System.out.println(a); //accessing element of array using for each loop
        }


        int arr[] ={10,20,30,50,60};

        System.out.println("----------------------------");
        for(int a :arr)
        {
            System.out.println(a);
        }

        arr[2] = 100; // setting a value in array
        System.out.println("----------------------------");
        for(int a :arr)
        {
            System.out.println(a);
        }

        System.out.println("----------------------------");
        //length
        System.out.println("length of array = " +arr.length);

    }
}
