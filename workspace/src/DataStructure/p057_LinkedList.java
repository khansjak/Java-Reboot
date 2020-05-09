import java.util.LinkedList;

public class p057_LinkedList {

    //Lookup(By Value)          : O(n)
    //Lookup(By index)          : O(n)

    //Insert(At the end)        : O(1)
    //Insert (At the Beginning) : O(1)
    //Insert (At the middle)    : O(n)

    //Delete(At the end)        : O(n)
    //Delete (At the Beginning) : O(1)
    //Delete (At the middle)    : O(n)

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        System.out.println(list.contains(20));
        System.out.println(list);
    }

}
