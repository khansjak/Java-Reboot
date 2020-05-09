package Assignments;

import java.util.Scanner;

//8.	If the ages of Ram, Sulabh and Ajay are input by the user, WAP to determine the youngest user.
public class A18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Ram's age :\n");
        int ram=in.nextInt();
        System.out.println("Enter Sulabh's age :\n");
        int sulabh=in.nextInt();
        System.out.println("Enter Ajay's age :\n");
        int ajay=in.nextInt();

        if (ram<sulabh && ram<ajay){
            System.out.println("Ram is younger");
        }else if (sulabh<ram && sulabh<ajay){
            System.out.println("Sulabh is younger");
        }
        else {
            System.out.println("Ajay is younger");
        }

    }
}
