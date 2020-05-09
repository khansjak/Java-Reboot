package models;

public class Employee{
    int employeeId;
    String employeeName;
    String city;

    //Default Constructor
    public Employee(){
        this.employeeId=101;
        this.employeeName="King Kocher";
        this.city= "Delhi";
    }



    public void displayDetails(){
        System.out.println("Default constructor invoked");
        System.out.println("person Id :"+this.employeeId);
        System.out.println("person name :"+this.employeeName);
        System.out.println("City :"+this.city);
    }
}