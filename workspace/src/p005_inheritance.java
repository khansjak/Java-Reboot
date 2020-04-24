class Student{
    //Data Members
    int studentId;
    String studentName;

    //Constructor Spcial method with same name as of class do not have return type because its job to initialize data member of the class
    //If we create constructor inside the class then object class constructor will not be created
    //If class have already a default constructor it will never go to see other constructor class

    //Default or non -parametrized constructor
    public Student(){
        System.out.println("Default Constructor invoked ");
        this.studentId=101;
        this.studentName="King Kocher";
    }

    //Parameterized Constructor
    public Student(int sid,String sname){
        System.out.println("Parameterized Constructor invoked ");
        this.studentId=sid;
        this.studentName=sname;
    }

    //Object type constructor
    public Student(Student student){
        System.out.println("Object type constructor called");
        this.studentId=student.studentId;
        this.studentName=student.studentName;
    }

    //Member Function
    public void displayDetail(){
        System.out.println("Student Id :"+this.studentId);
        System.out.println("Student Name :"+this.studentName);
    }
}

public class p005_inheritance {
    public static void main(String[] args) {

        //Object of the class , student is reference variable
        //Whenever we create a object of class memory gets allocated to member data variables and constructor called implicitly

        Student student=new Student();
        student.displayDetail();

        //Memoey gets allocated for member data variable again for another instance of this object of the class.
        Student student1=new Student(102,"Maria Bowman");
        student1.displayDetail();


        Student student2 = new Student();
        student2.studentId = student1.studentId;

        //This is called shallow copy without using constructor
        student2.studentName = student1.studentName;
        student2.displayDetail();


        //Copy values with copy constructor
        Student student3 = new Student(student2);
        student3.displayDetail();
    }
}
