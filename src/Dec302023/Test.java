package Dec302023;

 class Jungle {

   protected void makeNoise()
    {
        System.out.println("Jungle sound");
    }
}


class Cat extends Jungle
{
   public void makeNoise()
    {
        System.out.println("meow");
    }
}

public class Test
{
    public static void main(String[] args) {
        Cat cat=new Cat();

        System.out.print("Child object => ");
        cat.makeNoise();

        Jungle jungle=new Jungle();
        System.out.print("Parent object => ");
        jungle.makeNoise();

        Jungle parent=new Cat();
        parent.makeNoise();


    }
}