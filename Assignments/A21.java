package Assignments;

import java.util.Scanner;

/*
14.	In a company an employee is paid as under:
If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and DA = 90% of basic salary.
If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary.
If the employee's salary is input by the user write a program to find his gross salary.

 */
public class A21 {
    public static void main(String[] args) {
        double hra = 0,da=0,gross=0,salary=0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the salary :\n");
        salary = in.nextDouble();

        if (salary<1500){
            hra=(salary*10) / 100;
            da=(salary*90) / 100;
        }
        else if(salary>= 1500){
            hra=500;
            da=(salary*98)/ 100;
        }

        gross= hra+da+salary;
        System.out.println("Gross salary is "+gross);
    }
}
