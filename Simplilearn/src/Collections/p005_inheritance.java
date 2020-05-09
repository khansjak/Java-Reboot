package Collections;

import java.util.Scanner;

class Student {
    //Data Members
    int studentId;
    String studentName;

    public void acceptDetails() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Student Name :");
        this.studentName = in.nextLine();

        System.out.println("Enter Student Id: ");
        this.studentId = in.nextInt();

    }

    class Marks extends Student{
        float objectiveMarks;
        float subjectiveMarks;

        public void acceptDetails() {
            super.acceptDetails();
            Scanner in = new Scanner(System.in);

            System.out.println("Enter Objective Marks :");
            this.objectiveMarks = in.nextInt();

            System.out.println("Enter Subjective Marks: ");
            this.subjectiveMarks = in.nextInt();

        }

        public void displayDetail() {
            super.displayDetail();
            System.out.println("Objective Marks :" + this);
            System.out.println("Subjective Marks :" + this.studentName);
        }

    }

    //Member Function
    public void displayDetail() {
        System.out.println("Student Id :" + this.studentId);
        System.out.println("Student Name :" + this.studentName);
    }

}

public class p005_inheritance {
    public static void main(String[] args) {

        Student student = new Student();
        student.acceptDetails();
        student.displayDetail();

    }
}
