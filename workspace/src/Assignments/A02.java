package Assignments;

import java.util.*;

/*Write a program to display the following output using a single statement.
  Subject            Marks
   Mathematics     90
   Computer         77
   Chemistry        69
*/

public class A02 {
    public static void main(String[] args) {
        Hashtable<String,Integer> marks = new Hashtable<>();
        marks.put("Mathematics",90);
        marks.put("Computer",77);
        marks.put("Chemistry",69);

        Set<String> keys = marks.keySet();
        System.out.println(keys);
        System.out.println("Subject       Marks");
        System.out.println("--------------------");
        for (Map.Entry<String,Integer> entry: marks.entrySet()
             ) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key+" --> "+value);
        }

    }
}
