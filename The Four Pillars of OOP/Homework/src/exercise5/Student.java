package exercise5;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    private ArrayList<String> classes;
    private ArrayList<Double> gradees;

    // setter getter for private variables
    int getStudentID() {
        return studentID;
    }

    void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    String getStudentName() {
        return studentName;
    }

    void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<String> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<String> classes) {
        this.classes = classes;
    }

    public ArrayList<Double> getGradees() {
        return gradees;
    }

    public void setGradees(ArrayList<Double> gradees) {
        this.gradees = gradees;
    }

    Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.classes = new ArrayList<String>();
        this.gradees = new ArrayList<Double>();
    }
}
