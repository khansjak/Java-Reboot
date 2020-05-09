package Collections;

import java.util.Scanner;

public class p004_arrays2 {
    public static void main(String[] args) {
        int n, x, loc = 0, flag = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of the elements in the array ?");
        n = in.nextInt();
        int[] a = new int[n];
        //Accept elements of the array
        System.out.println("Enter elements of the array ?");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();

        }
        System.out.println("Enter the element you want to delete ?");
        x = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                flag = 1;
                loc = i;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            for (int i = loc + 1; i < n; i++) {
                a[i - 1] = a[i];
            }
            System.out.println("After deletion");
            for (int i = 0; i < n - 1; i++) {
                System.out.println(a[i] + ",");
            }
            System.out.println(a[n - 2]);
        } else {
            System.out.println("Elelemt not found");
        }
    }
}
