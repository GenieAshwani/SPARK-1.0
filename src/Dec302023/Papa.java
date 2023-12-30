package Dec302023;



public class Papa {
    public static void main(String[] args) {
        Animal animal=new Animal();
       String s= animal.ranveer();
        System.out.println(s);
        String s1 =animal.rashmika();
        System.out.println(s1);
        System.out.println("---------object with para---------");
        String r1=animal.ranveer("rashmika");
        System.out.println(r1);
        String r2=animal.ranveer("ranveer");
        System.out.println(r2);

        int res = animal.ranveer(10); //ctrl + alt +v
        System.out.println(res);
        System.out.println(animal.ranveer(10,40));

    }
}
