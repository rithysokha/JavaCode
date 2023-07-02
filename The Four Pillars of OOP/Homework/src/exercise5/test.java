package exercise5;

import java.util.HashMap;

 class test {
    private int studentID;
    private String studentName;
    private HashMap<String, HashMap<Integer, Double>> classAndGradde = new HashMap<>();
    
    test (int studentID, String StudentName, HashMap classAndGrade) {

        this.studentID=studentID;
        this.studentName = studentName;
        this.classAndGradde = classAndGrade ;
    }

}
