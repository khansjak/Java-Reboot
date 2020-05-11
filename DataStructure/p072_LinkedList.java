package DataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class p072_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        System.out.println("---------------------------------------------------");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("---------------------------------------------------");
        System.out.println(animals);
        //Index Implementation of Linked List
        animals.add(0, "Rabbit");
        animals.add(1, "Lion");
        animals.add(2, "Horse");
        System.out.println("---------------------------------------------------");
        System.out.println(animals);
        System.out.println("---------------------------------------------------");
        //Add elements : One linked list to another
        LinkedList<String> mammal = new LinkedList<>();
        mammal.add("Elelphant");
        mammal.add("Crocodile");
        mammal.add("Bats");
        System.out.println("---------------------------------------------------");
        animals.addAll(mammal);
        System.out.println("Animal List after adding mammls " + animals);
        System.out.println("---------------------------------------------------");
        //Add Elements using list iterator method
        ListIterator<String> listIterator = animals.listIterator();
        listIterator.add("Pangolin");
        listIterator.add("Sharks");
        System.out.println(animals);
        System.out.println("---------------------------------------------------");
        //Access using iterator method
        Iterator itr = animals.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("---------------------------------------------------");
        //Access using List Itertaor
        while (listIterator.hasNext()) {
            System.out.println("Forward " + listIterator.next());
        }
        System.out.println("---------------------------------------------------");
        while (listIterator.hasPrevious()) {
            System.out.println("Backward " + listIterator.previous());
        }
        System.out.println("---------------------------------------------------");
        //Search Linked List
        if (animals.contains("Dog"))
            System.out.println("Dog is part of the list");
        else
            System.out.println("Dog is not a part of the list ");
        System.out.println("---------------------------------------------------");
        //Search using indexOf method
        System.out.println("First occurance of Dog :" + animals.indexOf("Dog"));
        System.out.println("Last occurance of Dog :" + animals.lastIndexOf("Dog"));
        System.out.println("---------------------------------------------------");
        //Change Linked List Elements
        animals.set(3,"Zebra");
        System.out.println("After changing list :"+animals);
        System.out.println("---------------------------------------------------");
        //Change using listIterator
        listIterator.set("T-Rex");



        //Clear all
        //animals.clear();
        //System.out.println("New Linked List "+animals);
        System.out.println("---------------------------------------------------");
        //Using For each loop
        System.out.println("Accessing Linked list elements using for each ");
        for (String animal: animals
             ) {
            System.out.println(animal);
        }
        System.out.println("---------------------------------------------------");
        //Accessing using for loop
        System.out.println("Printing animals using for loop");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
    }
}
