package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class p051_ArrayList {
    public static void Process(){
        ArrayList<String> list = new ArrayList<>();
        list.add("John");
        list.add("James");
        list.add("Mathews");
        list.add("Walter");

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
