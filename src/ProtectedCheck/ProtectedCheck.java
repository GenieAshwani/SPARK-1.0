package ProtectedCheck;


import Jan212024.ProtectedExm;

public class ProtectedCheck extends ProtectedExm {


    public void m1()
    {
        int a=demo;
        display();
    }

    @Override
    protected void display() {
        System.out.println("slslsldlj");
    }

    public static void main(String[] args) {
        ProtectedCheck protectedCheck= new ProtectedCheck();
        protectedCheck.display();
    }
}
