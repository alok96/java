package com.zef;

import java.util.Scanner;

public class DataTypes {

    void studentsInfo() {
        int studentAge = 15;
        double studentGPA = 4.5;
//       char studentFirstInitial = 'A';
//       char studentLastInitital = 'K';
        String firstName = "Alok";
        String lastName = "Kumar";
        String fullName = firstName + " " + lastName;
        boolean perfectAttendence = true;

        System.out.println("student age:  " + studentAge + ", student GPA: " + studentGPA
                + ",  student name: " + fullName + ",  student First Initial: " + firstName.charAt(0)
                + ", student Last Initital: " + lastName.charAt(0) + ", perfect Attendence: " + perfectAttendence);

        Scanner input = new Scanner(System.in);
        System.out.print("update GPA?");
        studentGPA = input.nextDouble();
        System.out.println("student name: " + fullName + " student GPA: " + studentGPA);
    }
}
