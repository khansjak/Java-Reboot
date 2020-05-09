import java.util.Vector;

public class p011_vectors {
    public static void main(String[] args) {
        Vector<String > vector = new Vector<String>();
        System.out.println(vector.capacity());
        vector.addElement("a");
        vector.addElement("b");
        vector.addElement("c");

        System.out.println(vector.size());
        System.out.println(vector.capacity());

        vector.addElement("d");
        vector.addElement("e");
        vector.addElement("f");
        vector.addElement("g");
        vector.addElement("h");

        System.out.println(vector.size());
        System.out.println(vector.capacity());

        vector.addElement("i");
        vector.addElement("j");
        vector.addElement("k");

        System.out.println(vector.size());
        System.out.println(vector.capacity());

        //System.out.println(vector.ensureCapacity(20));
    }
}
