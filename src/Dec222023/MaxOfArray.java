package Dec222023;

public class MaxOfArray {
    public static void main(String[] args) {
        int []arr ={8,4,5,88,44,12,3};

        //max
        int max =arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
