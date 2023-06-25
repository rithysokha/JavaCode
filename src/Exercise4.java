
//group8
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        // initialize three student objects
        Score scoreS1 = new Score(10, 20, 30);
        Student student1 = new Student(1, "Seng Wayha", scoreS1);

        Score scoreS2 = new Score(15, 25, 30);
        Student student2 = new Student(2, "Sen Sunneng", scoreS2);

        Score scoreS3 = new Score(5, 20, 35);
        Student student3 = new Student(3, "Sokha Rithy", scoreS3);

        // store student objects in hashmap
        HashMap<Integer, Student> listOfStudent = new HashMap<>();
        listOfStudent.put(student1.id, student1);
        listOfStudent.put(student2.id, student2);
        listOfStudent.put(student3.id, student3);

        boolean exit = false;
        while (!exit) {

            // display a menu
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("a. Add a new student");
            System.out.println("b. Delete student by id");
            System.out.println("c. Search student by id");
            System.out.println("d. Display all students");
            System.out.println("e. Exit the program");
            System.out.print("Choose an option : ");
            char put = input.nextLine().charAt(0);
            System.out.println();

            Student student = new Student();

            switch (put) {

                // add new student
                case 'a', 'A' -> {
                    student.readStudent();
                    listOfStudent.put(student.id, student);
                }

                // remove student by id
                case 'b', 'B' -> {
                    System.out.print("Input id to remove: ");
                    int idToRemove = input.nextInt();

                    displayLine();
                    if (!listOfStudent.containsKey(idToRemove)) {
                        System.out.println("Invalid id!");
                    } else {
                        listOfStudent.remove(idToRemove);
                        System.out.println(" Remove successfully ");

                    }
                    displayLine();
                }

                // search student by id
                case 'c', 'C' -> {
                    System.out.print("Input id to search: ");
                    int idToSearch = input.nextInt();

                    displayLine();
                    if (listOfStudent.containsKey(idToSearch)) {
                        System.out.printf("%5s %20s %10s %10s %10s %10s\n", "ID", "Name", "Math", "Physics",
                                "Chemistry", "Total");
                        System.out.println();

                        System.out.printf("%5d %20s %10d %10d %10d %10d\n", listOfStudent.get(idToSearch).id,
                                listOfStudent.get(idToSearch).name, listOfStudent.get(idToSearch).score.math_score,
                                listOfStudent.get(idToSearch).score.phy_score,
                                listOfStudent.get(idToSearch).score.chem_score,
                                listOfStudent.get(idToSearch).score.getTotal());
                        System.out.println();
                    } else {
                        System.out.println("Invalid id!");
                    }
                    displayLine();
                }

                // display all student
                case 'd', 'D' -> {
                    displayLine();
                    System.out.printf("%5s %20s %10s %10s %10s %10s\n", "ID", "Name", "Math", "Physics", "Chemistry",
                            "Total");
                    System.out.println();

                    for (Map.Entry<Integer, Student> studentData : listOfStudent.entrySet()) {
                        System.out.printf("%5d %20s %10d %10d %10d %10d\n", studentData.getKey(),
                                studentData.getValue().name,
                                studentData.getValue().score.math_score, studentData.getValue().score.phy_score,
                                studentData.getValue().score.chem_score, studentData.getValue().score.getTotal());
                    }
                    System.out.println();
                    displayLine();
                }

                // exit the program
                case 'e', 'E' -> {
                    displayLine();
                    System.out.println("Exiting the program...");
                    exit = true;
                    displayLine();
                }
                default -> {
                    displayLine();
                    System.out.println("Invalid Input...");
                    displayLine();
                }
            }
        }
    }

    static void displayLine() {
        System.out.println("===============================================================================");
    }
}

class Score {
    int math_score;
    int phy_score;
    int chem_score;

    // parameterized constructor with three parameters
    Score(int math_score, int phy_score, int chem_score) {
        this.math_score = math_score;
        this.phy_score = phy_score;
        this.chem_score = chem_score;
    }

    Score() {

    }

    // method return the total score
    int getTotal() {
        return math_score + phy_score + chem_score;
    }
}

class Student {
    int id;
    String name;
    Score score = new Score();

    // parameterized constructor with three parameters
    Student(int id, String name, Score score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    Student() {

    }

    // method input the information
    public void readStudent() {
        Exercise4.displayLine();

        System.out.println();
        Scanner input = new Scanner(System.in);

        System.out.print("Input Student's ID : ");
        id = input.nextInt();
        input.nextLine();

        System.out.print("Input Student's Name : ");
        name = input.nextLine();

        System.out.println("Input Student's score : ");
        System.out.print("Input maths score : ");
        score.math_score = input.nextInt();

        System.out.print("Input physic score : ");
        score.phy_score = input.nextInt();

        System.out.print("Input chemistry score : ");
        score.chem_score = input.nextInt();

        System.out.println();

        Exercise4.displayLine();
    }
}
