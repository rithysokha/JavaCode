package exercise5;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    private ArrayList<String> classTaken;
    private ArrayList<Double> gradees;

    // setter getter method for acessing private variables
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<String> getClassTaken() {
        return classTaken;
    }

    public void setClassTaken(ArrayList<String> classTaken) {
        this.classTaken = classTaken;
    }

    public ArrayList<Double> getGradees() {
        return gradees;
    }

    public void setGradees(ArrayList<Double> gradees) {
        this.gradees = gradees;
    }

    Student() {
        this.classTaken = new ArrayList<String>();
        this.gradees = new ArrayList<Double>();
    }

    // add new class to the student
    void addClass(String className, double grade) {
        // make the class capitalize to look good
        String classUpperCase = className.substring(0, 1).toUpperCase() + className.substring(1);
        classTaken.add(classUpperCase);
        gradees.add(grade);
        System.out.println(classUpperCase + " was added to acedemic record with the grade of " + grade);
    }

    void dropClass(String className) {
        // make the class capitalize so user can input any case of letter to remove
        // class
        String classUpperCase = className.substring(0, 1).toUpperCase() + className.substring(1);
        int indexRemove = this.classTaken.indexOf(classUpperCase);
        if (indexRemove != -1) {// if class is not valid the index is -1
            gradees.remove(indexRemove);
            classTaken.remove(indexRemove);
            System.out.println(classUpperCase + " was droppped from the accedemic record");
        } else
            System.out.println("The class you entered is not available");
    }

    double calculateGPA() {
        double overalGPA = 0;
        for (double grade : gradees) {
            overalGPA += grade;
        }
        System.out.println("Student ID: " + studentID);
        System.out.println("Student name: " + studentName);
        for (int i = 0; i < classTaken.size(); i++) {
            System.out.println("Grade of " + classTaken.get(i) + " : " + gradees.get(i));
        }
        overalGPA /= gradees.size();
        System.out.printf("Overal GPA : %.2f" ,  overalGPA);
        System.out.println();
        return overalGPA;
    }

}