package Jan282024;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer,String> mapDemo=new HashMap<>();

        mapDemo.put(10,"Raj");
        mapDemo.put(11,"Simarn");
        mapDemo.put(12,"Rishab");
        mapDemo.put(13,"RishabkiGf");
        System.out.println(mapDemo);
        mapDemo.put(null,"null value"); // only one time
        mapDemo.put(11,"New Gf");
        System.out.println(mapDemo); //order

        System.out.println("null value = "+mapDemo.get(null));


        Iterator<Map.Entry<Integer, String>> iterator = mapDemo.entrySet().iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        Iterator<Integer> iterator1 = mapDemo.keySet().iterator();
        while (iterator1.hasNext())
        {
            Integer key =iterator1.next();
            System.out.println("key ="+key);
            System.out.println("value = "+mapDemo.get(key));
        }

        mapDemo.keySet().stream().forEach(System.out::println);


    }
}
