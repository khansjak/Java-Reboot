package models;

public class Person {
    int personId;
    String personName;
    String city;

    //Default Constructor
    public Person(){
        this.personId=101;
        this.personName="King Kocher";
        this.city= "Delhi";
    }



    public void displayDetails(){
        System.out.println("Default constructor invoked");
        System.out.println("person Id :"+this.personId);
        System.out.println("person name :"+this.personName);
        System.out.println("City :"+this.city);

    }
}



