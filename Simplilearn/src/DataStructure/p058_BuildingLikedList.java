package DataStructure;

public class p058_BuildingLikedList {
    static class LinkedList {
        public class Node {
            public Node next;
            private int value;
            private Node Next;

            public Node(int item) {

            }


            public void setValue(int value) {
                this.value = value;
            }
        }

        private Node first;
        private Node last;

        //Add LastNode
        public void addLast(int item) {
            //var node = new Node();
            Node node = new Node(item);
            if (first == null) {
                first = last = node;
            } else {
                last.next = node;
                last = node;
            }
            //node.setValue(item);
            node.value = item;

        }
        //Add FirstNode



        //Remove FirstNode
        public void removeFirst() {
            Node second = first.next;
            first = second;
        }
        //Remove LastNode
        //Contains
        //indexOf
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(100);
        list.addLast(200);
        list.addLast(300);


        System.out.println("List contain 100 or not ");
    }
}
