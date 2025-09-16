/***
 * Author : Karandeep Singh
 * Project : Student Management System Lite
 * File : Main.java
 * Version : 1.0.0
 */

package com.studentmanagement;

public class Main {
    public static void main(String[] args){
        ManagementSystem ms = new ManagementSystem(10);

        // Adding Students
        ms.addStudent("Test1",20,3.5,new String[]{"Math", "English"});
        ms.addStudent("Test2",22);

        // Display All Students
        ms.displayAllStudents();
    }

}
