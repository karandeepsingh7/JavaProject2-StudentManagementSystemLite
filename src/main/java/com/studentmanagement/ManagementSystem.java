/***
 * Author : Karandeep Singh
 * Project : Student Management System Lite
 * File : ManagementSystem.java
 * Version : 1.0.0
 */

package com.studentmanagement;

public class ManagementSystem {
    private final Object[] students;
    private final int capacity;
    private int size = 0;

    // Constructor taking capacity of students array
    public ManagementSystem(int capacity){
        this.capacity = capacity;
        this.students = new Object[capacity];
    }

    // Add Student
    public void addStudent(String name, int age){
        addStudent(name,age,0.0,new String[0]);
    }

    public void addStudent(String name, int age, double gpa, String[] courses){
        if(size >= capacity){
            System.out.println("Cannot add more students");
        }
        Student s = new Student(name,age,gpa,courses);
        students[size++] = s;
        System.out.println("New : " + s);
    }

    // Display All Students
    public void displayAllStudents(){
        if(size==0){
            System.out.println("No Students to Display");
        }
        for(int i = 0; i<size;i++){
            Student s = (Student) students[i]; // downcasting
            System.out.println("Index " + i + "->" + s);
        }
    }
}
