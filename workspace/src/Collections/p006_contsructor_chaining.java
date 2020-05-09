class Person{
    int personId;
    String personName;

    //Default Constructor
    public Person(){
        this(111,"Unknown");
        this.personId=101;
        this.personName="King Kocher";
    }

    public Person(int personId , String personName){
        System.out.println("Parameterized constructor invoked");
        this.displayDetails();
        this.personName = personName;
        this.personId = personId;
    }

    public void displayDetails(){
        System.out.println("Default constructor invoked");
        System.out.println("person Id :"+this.personId);
        System.out.println("person name :"+this.personName);
    }
}


public class p006_contsructor_chaining {
    public static void main(String[] args) {
        Person person = new Person();
        person.displayDetails();

        //Person person1 = new Person(102,"Sara");
        //person1.displayDetails();
    }
}
