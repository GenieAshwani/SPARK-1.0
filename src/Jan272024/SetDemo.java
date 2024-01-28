package Jan272024;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        //order no
        //duplicate not allowed
        Set<Integer> set= new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set);
        System.out.println(set.remove(30));

    }
}
