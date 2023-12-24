package Dec222023;

public class SummOfArray {

    public static void main(String[] args) {
        //int arr[] = new int[5];
        int arr[] = {10,20,30,40,50};

        //int sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        int sum=0;


        int k=18;
        boolean flag =false;
        for (int i = 0; i < arr.length; i++) {

             //sum =sum+ arr[i];
            if(arr[i]==k)
            {
                flag=true;
            }


        }
        System.out.println(flag);
        System.out.println(sum);

    }
}
