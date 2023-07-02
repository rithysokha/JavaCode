package exercise5;

import java.util.Scanner;

public class Program {
    //method to display menu
    static void displayMenu() {
        displayLine();
        System.out.println("Please choose option below: ");
        System.out.println("A: Add class.");
        System.out.println("B: Drop class");
        System.out.println("C: Calculate overal GPA");
        System.out.println("D: Exit");

    }
    //method to display line
    static void displayLine() {
        System.out.println("-------------------------------------------------------");
    }

    public static void main(String[] args) {
        Student studentObj = new Student() {
        };
        //set student id and name by setter method because of private variable
        studentObj.setStudentID(1001);
        studentObj.setStudentName("Sovan");
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        displayMenu();
        //the switch case will work till menu = 'd', 'D'
        while (!exit) {
            char menu = input.next().charAt(0);
            input.nextLine();
            switch (menu) {
                case 'a', 'A':
                    displayLine();
                    System.out.println("Enter the class taken: ");
                    String classTaken = input.nextLine();
                    System.out.println("Enter the grade for the student: ");
                    Double grade = input.nextDouble();
                    studentObj.addClass(classTaken, grade);
                    displayMenu();
                    break;
                case 'b', 'B':
                    displayLine();
                    System.out.println("Enter the class to drop: ");
                    String dropClass = input.nextLine();
                    studentObj.dropClass(dropClass);
                    displayMenu();
                    break;
                case 'c', 'C':
                    displayLine();
                    studentObj.calculateGPA();
                    displayMenu();
                    break;
                case 'd', 'D':
                    displayLine();
                    exit = true;
                    break;
                default:
                    displayLine();
                    System.out.println("Invalid choise!");
                    displayMenu();
                    break;
            }

        }
        input.close();
    }

}
