package Arrays;

import models.Employee;
import models.Person;
import models.User;

public class p000_helloMain {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        person.displayDetails();
        employee.displayDetails();

        User user = new User();
        user.setUserId(222);
        user.setUserName("King Drake");
        System.out.println(user.getUserId());
        System.out.println(user.getUserName());
    }
}
