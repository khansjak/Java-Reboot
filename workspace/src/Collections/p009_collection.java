import java.util.ArrayList;
import java.util.Iterator;

public class p009_collection {

    public static void main(String[] args) {
        ArrayList<String> emps = new ArrayList<String>();
        emps.add("King");
        emps.add("Kocher");
        emps.add("Sara");
        emps.add("Bowling");
        emps.add(1,"Jack");

        for (String ename: emps) {
            //System.out.println(ename);
        }
        emps.remove(2);
        emps.set(2,"Bhawana");
        Iterator<String> iterate = emps.iterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next());

        }
        System.out.printf(emps.get(2));

        ArrayList emps2 = new ArrayList();
        emps2.add("Kanak");
        emps2.add("Gautam");
        emps2.add("Bhavathi");
        System.out.println("************************");

        emps.addAll(emps2);

        for (String ename:emps
             ) {
            System.out.println(ename);
        }
        System.out.println("************************");
        System.out.println(emps.contains("Bhawana"));
        emps.removeAll(emps);

        for (String ename:emps
        ) {
            System.out.println(ename);
        }

        ArrayList emps3 = new ArrayList();
        emps3.add("Kube");
        emps3.add("Cory");

        emps2.retainAll(emps3);

        for (Object ename:emps2
        ) {
            System.out.println(ename);
        }

    }
}
