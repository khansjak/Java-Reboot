//Stores data in key value pair
//Key must be unique
//Allow only one null key and multiple null values
//Doesn't maintain order of insertion


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class p012_hashmap {
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1,"One");
        hashMap.put(2,"Two");
        hashMap.put(3,"Three");
        hashMap.put(4,"Four");
        hashMap.put(5,"Five");

        System.out.println(hashMap);//{1=One, 2=Two, 3=Three, 4=Four, 5=Five}
        System.out.println(hashMap.get(1)); //One
        System.out.println(hashMap.get(10));//null

        //put(),putAll()
        //remove(),clear();

        Set<Integer> keys = hashMap.keySet();
        System.out.println(keys);//[1, 2, 3, 4, 5]

        Collection<String> collection = hashMap.values();
        System.out.println(collection);//[One, Two, Three, Four, Five]

        for (Map.Entry<Integer,String> entry: hashMap.entrySet()
             ) {
            Integer key=entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+":"+value);
            /*  1:One
                2:Two
                3:Three
                4:Four
                5:Five*/
        }
    }
}
