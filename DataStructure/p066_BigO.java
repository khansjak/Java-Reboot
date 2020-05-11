package DataStructure;

public class p066_BigO {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Hello " + n);//Complexity of Algorithm , N is constant and its decribed

        //1. O(3)  which is equivalent to O(1)
        int n1 = 100;
        System.out.println("Hello " + n);
        System.out.printf("Hey " + n);
        System.out.println("Bye " + n1);
        //Note : O(1), O(2) , O(3) and even O(1000) are equivalent to Constant time thus the complexity is O(1)


        //2. Considering n =8 : log(n)
        for (int i = 1; i < n; i = i * 2) {
            System.out.println("Hello " + i);
        }
        //Logarithmic time O(log n):Runtime grow in proportion to the algorithm of the input
        //Log(8) = 3 Times

        //3. Complexity : When n is not fixed then Complexity is Big O(n)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        //4. Complexity : O(n)
        for (int i = 0; i < n; i++) {
            System.out.println("Hello " + n);
            System.out.printf("Hey " + n);
            System.out.println("Bye " + n1);
        }

        //5. Complexity : O(n log n) N Log N Time Algorithm
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 8; j = j * 2) {
                System.out.println("Hello " + i + " and " + j);
            }
        }

    }
}


