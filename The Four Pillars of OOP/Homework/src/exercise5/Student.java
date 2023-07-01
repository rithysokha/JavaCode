package exercise5;

import java.util.ArrayList;
import java.util.HashMap;

import javax.naming.ldap.HasControls;

public class Student {
    private int studentID;
    private String studentName;
    private ArrayList<String> classTaken;
    private ArrayList<Double> gradees;

    // setter getter for private variables
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

    public ArrayList<String> getclassTaken() {
        return classTaken;
    }

    public void setclassTaken(ArrayList<String> classTaken) {
        this.classTaken = classTaken;
    }

    public ArrayList<Double> getGradees() {
        return gradees;
    }

    public void setGradees(ArrayList<Double> gradees) {
        this.gradees = gradees;
    }

    Student(String studentName) {
        this.studentID = studentHashMap.size()+1;//student id is count from 1
        this.studentName = studentName;
        this.classTaken = new ArrayList<String>();
        this.gradees = new ArrayList<Double>();
    }

    void addClass(String className, double grade) {
        classTaken.add(className);
        gradees.add(grade);
    }
    void dropClass(String className){
        int indexRemove = this.classTaken.indexOf(className);
        if(indexRemove != -1){
            classTaken.remove(indexRemove);
            gradees.remove(indexRemove);
        }
    }
    double calculateGPA(){
        double overalGPA =0;
        for(double grade : gradees ){
            overalGPA += grade;
        }
        return overalGPA;
    }
    public static HashMap <Integer , Student> studentHashMap = new HashMap<>();  
} 
