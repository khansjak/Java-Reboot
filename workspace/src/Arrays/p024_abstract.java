import java.util.Date;

public class p024_abstract {
    public static void main(String[] args) {
        Employee dan = new regularEmployee("Dan","HR",1200);
        Employee ben = new contractEmployee("Ben","Engine",1500);

        System.out.println("Dans Salary is "+dan.getSalary());
        System.out.println("Ben Salary is  "+ben.getSalary());
    }
}

abstract class Employee{
    String name;
    Date doj;
    int salary;
    String department;

    Employee(String name,String department){
        this.name=name;
        this.department=department;
    }
    public String getName(){
        return this.name;
    }

    public Date getDoj() {
        return this.doj;
    }
    abstract int getSalary();
}

class contractEmployee extends Employee{

    contractEmployee(String name, String department,int salary) {
        super(name, department);
        this.salary=salary;
    }

    @Override
    int getSalary() {
        return (int) (this.salary *0.5);
    }
}

class regularEmployee extends Employee{

    regularEmployee(String name, String department,int salary) {
        super(name, department);
        this.salary=salary;
    }

    @Override
    int getSalary() {
        return (int) (this.salary*.8);
    }
}