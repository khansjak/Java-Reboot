
class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {

        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);

        }
    }

    public void insert(int item) {
        //Check if the array is full then resize it.
        //Add the new item at the end.
        if (items.length == count) {
            //Create a new array twice the size of original array
            int[] newItems = new int[count * 2];
            //Copy all existing items in new array
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            //Set items to new array
            items = newItems;
        }
        items[count] = item;
        count++;
        System.out.println((items.length));
    }

    public void removeAt(int index) {
        //Validate the index
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        //Shift items towards left to fill the empty spaces
        for (int i = 0; i < count; i++)
            items[i] = items[i + 1];
        count--;
    }

    public int indexOf(int item) {
        //If we find item , return index
        //otherwise return -1
        for (int i = 0; i < count; i++) {
            if (items[i] == item)
                return i;
            return -1;
        }
        return item;
    }
}

public class p056_BuildArray {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);

        //upto 3 no problem but when you insert 4rth element the array will expand twice size of original size
        numbers.insert(40);
        numbers.print();
        System.out.println("-------After removal of index--------");
        numbers.removeAt(1);
        numbers.print();
        System.out.println("Index of item 50 :" + numbers.indexOf(50));
        System.out.println("Index of item 20 :" + numbers.indexOf(20));
        System.out.println("Index of item 30 :" + numbers.indexOf(30));

    }

}
