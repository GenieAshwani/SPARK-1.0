package Dec242023;

public class StringBufferFunctions {
    public static void main(String[] args) {

        //append()
        StringBuffer sb=new StringBuffer("Archi");
        sb.append("jain");
        System.out.println(sb);

        //insert()
        sb.insert(2,123);
        System.out.println(sb);

        //reverse()
        sb.reverse();
        System.out.println(sb);

        //replace()
        sb.replace(6,11,"hello");
        System.out.println(sb);

        StringBuffer sb1=new StringBuffer("sdsdsdsdsd");
        System.out.println(sb1.capacity());
    }
}
