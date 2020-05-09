package Collections;/*
1. Stores element in sorted format.
2. Contains only unique elements.
3. Doesn't allow duplicate values.
4. Doesnt maintain insertion order.
5. Doesn't allow null values.
6. Use when you want to store unique values in sorted order.
 */


import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class p013_treeset {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("East");
        treeSet.add("North");
        treeSet.add("West");
        treeSet.add("South");

        System.out.println(treeSet); // [East, North, South, West]
        System.out.println(treeSet.size());//4

        Iterator<String> iterate = treeSet.iterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next());

        }
    }
}
