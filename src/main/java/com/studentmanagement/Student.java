/***
 * Author : Karandeep Singh
 * Project : Student Management System Lite
 * File : Student.java
 * Version : 1.0.0
 */

package com.studentmanagement;

public class Student {
    // Constants and Static Variables
    private static int nextID=1;

    // Define fields
    private final int id;
    private String name;
    private int age;
    private double gpa;
    private String[] courses;

    // Constructor
    public Student(String name,int age,double gpa,String[] courses)
    {
        if(age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.id = nextID++;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.courses = courses;
    }

    // Overloaded Constructor
    public Student(String name, int age){
        this(name,age,0.0,new String[0]);
    }

    // Getter
    public int getId(){return id;}

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return "Student ID=" + id + " , Name=" + name + " , Age=" + age + " , GPA=" + gpa;
    }

}
