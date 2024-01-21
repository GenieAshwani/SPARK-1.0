package Jan212024;


 class MyProtectedClass
{
    protected int a=199;
    protected void display()
    {
        System.out.println("Main hu Raja Bina Paise wala");
    }
}
public class ProtectedDemo {
    public static void main(String[] args) {
        MyProtectedClass myProtectedClass=new MyProtectedClass();
        System.out.println(myProtectedClass.a);
        myProtectedClass.display();
    }
}
