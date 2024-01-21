package Jan212024;

public class ProtectedCheckDemo extends MyProtectedClass{
    public static void main(String[] args) {
        MyProtectedClass myProtectedClass= new MyProtectedClass();
        myProtectedClass.display();
        System.out.println(myProtectedClass.a);
    }
}
