import java.util.LinkedList;

public class p010_linkedlist {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("King");
        linkedList.add("Koccher");
        linkedList.add("Aubrey");
        linkedList.add("Morgan");
        linkedList.add("Morgan");

        System.out.println("----------1-----------");
        for (String val : linkedList
        ) {
            System.out.println(val);
        }

        System.out.println("----------2-----------");
        linkedList.addFirst("Shawn Asadi");
        linkedList.addLast("Jose Morales");

        for (String val : linkedList
        ) {
            System.out.println(val);
        }

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("----------3-----------");
        for (String val : linkedList
        ) {
            System.out.println(val);
        }

        System.out.println("----------4-----------");
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(2));

        System.out.println("----------5-----------");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("----------6-----------");
        linkedList.removeFirstOccurrence("Morgan");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

    }
}
