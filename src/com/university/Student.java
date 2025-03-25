package com.university;

public class Student {
    public String name;
    protected int studentId;
    String kulliyyah;
    private double gpa;

    public Student(String name, int studentId, String kulliyyah, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.kulliyyah = kulliyyah;
        this.gpa = gpa;
    }

    //public method
    public void displayPublicStudentInfo() {
        System.out.println("Pub Name: " + name);
        System.out.println("Pub Kulliyyah: " + kulliyyah);
    }

    //protected method
    protected void displayProtectedStudentInfo() {
        System.out.println("Pro Student ID: " + studentId);
    }

    //default method
    void displayDefaultStudentInfo() {
        System.out.println("DEf Kulliyyah: " + kulliyyah);
    }

    //private method
    private void displayPrivateStudentInfo() {
        System.out.println("Priv GPA: " + gpa);
    }

    //public method that can access private method
    public void showAllInfo(){
        System.out.println();
        displayPublicStudentInfo();
        displayProtectedStudentInfo();
        displayDefaultStudentInfo();
        displayPrivateStudentInfo();
    }
}
