package Collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class p013_hastable {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable();
        hashtable.put(1,"One");
        hashtable.put(2,"Two");
        hashtable.put(3,"Three");
        hashtable.put(4,"Four");
        hashtable.put(5,"Five");

        System.out.println(hashtable);//{5=Five, 4=Four, 3=Three, 2=Two, 1=One}
        System.out.println(hashtable.get(1));
        System.out.println(hashtable.get(10));

        Set<Integer> keys = hashtable.keySet();
        System.out.println(keys);//[5, 4, 3, 2, 1]

        for (Map.Entry<Integer,String> entry: hashtable.entrySet()
        ) {
            Integer key=entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+":"+value);
            /*  5:Five
                4:Four
                3:Three
                2:Two
                1:One*/
        }
    }
}
