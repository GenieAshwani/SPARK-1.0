package Jan072023;

public class VarArgDemo {
    public static void main(String[] args) {
        sum(10,10);
        sum(10,10,10);
        sum(10,10,10,10);
        sum(10,10,10,10,10);
        sum(10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10);

    }

    public static void sum(int... x)
    {
        int res=0;
        for(int i=0;i<x.length;i++)
        {
            res=res+x[i];
        }
        System.out.println(res);
    }




    /*
    public static void sum(int a,int b)
    {
        System.out.println(a+b);
    }

    public static void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void sum(int a,int b,int c,int d)
    {
        System.out.println(a+b+c+d);
    }
    public static void sum(int a,int b,int c,int d,int e)
    {
        System.out.println(a+b+c+d+e);
    }


     */


}
