package com.Bharat.studentManagment;

public class Student {
    private String name;
    private int rollNo;
    private int adminNo;
    private int classDiv;

    public Student(String name, int rollNo, int adminNo, int classDiv) {
        this.name = name;
        this.rollNo = rollNo;
        this.adminNo = adminNo;
        this.classDiv = classDiv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(int adminNo) {
        this.adminNo = adminNo;
    }

    public int getClassDiv() {
        return classDiv;
    }

    public void setClassDiv(int classDiv) {
        this.classDiv = classDiv;
    }
}
