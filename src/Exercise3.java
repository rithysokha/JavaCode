//group8
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        // Create function for user Input
        Scanner input = new Scanner(System.in);
        // TODO Auto-generated method stub

        // HasMap store ID employee
        Map<Integer, Integer> employeesID = new HashMap<>();
        employeesID.put(1, 1);
        employeesID.put(2, 2);
        employeesID.put(3, 3);

        // HashMap store Name as String
        Map<Integer, String> employeesName = new HashMap<>();
        employeesName.put(1, "Chan Dara");
        employeesName.put(2, "Sok Sophea");
        employeesName.put(3, "Keo Tola");

        // HashMap store Salary as Integer
        Map<Integer, Integer> employeesSalary = new HashMap<>();
        employeesSalary.put(1, 800);
        employeesSalary.put(2, 700);
        employeesSalary.put(3, 500);

        // HashMap store Department as String
        Map<Integer, String> employeesDepartment = new HashMap<>();
        employeesDepartment.put(1, "ITE");
        employeesDepartment.put(2, "BioE");
        employeesDepartment.put(3, "TEE");

        // Create condition for loop to display
        boolean exit = false;
        while (!exit) {
            System.out.println("Please select an option:");
            System.out.println("a. Display all employees");
            System.out.println("b. Add a new employee");
            System.out.println("c. Delete employee by ID");
            System.out.println("d. Update employee by ID");
            System.out.println("e. Search employee by ID");
            System.out.println("f. Exit the program");

            // Create Conditon for switch loop
            String condition = input.nextLine();

            switch (condition) {
                case "a":

                    System.out.println("---------------------------------------------");
                    System.out.println("ID" + "\t" + "Name" + "\t   " + "Salary" + "\t" + "Department");
                    System.out.println("---------------------------------------------");

                    for (Map.Entry<Integer, Integer> entry : employeesID.entrySet()) {
                        int id = entry.getKey();
                        System.out.printf("%d%14s%10d%13s\n", employeesID.get(id), employeesName.get(id),
                                employeesSalary.get(id), employeesDepartment.get(id));

                    }
                    System.out.println();
                    break;
                case "b":
                    System.out.println("<= Add new employee =>");

                    System.out.print("Enter ID : ");
                    Integer id = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Name : ");
                    String name = input.nextLine();
                    System.out.print("enter salary : ");
                    Integer salary = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Department : ");
                    String dep = input.nextLine();

                    // use Function put to add data
                    employeesID.put(id, id);
                    employeesName.put(id, name);
                    employeesSalary.put(id, salary);
                    employeesDepartment.put(id, dep);

                    System.out.println("Employee added successfully... !");
                    System.out.println();
                    break;
                case "c":
                    System.out.println("<= Delete Employee By ID =>");

                    System.out.print("Enter ID to Delete : ");
                    Integer deleteID = input.nextInt();
                    input.nextLine();

                    // use containkey to check data
                    if (employeesID.containsKey(deleteID)) {

                        // use remove function to delete
                        employeesID.remove(deleteID);
                        employeesName.remove(deleteID);
                        employeesSalary.remove(deleteID);
                        employeesDepartment.remove(deleteID);
                        System.out.println(deleteID + "have Been delete ...!");
                    } else {
                        System.out.println("Employee with id " + deleteID + " not found.");
                    }

                    break;
                case "d":
                    System.out.println("<= Update Employee By ID =>");

                    System.out.print("Update new ID : ");
                    Integer UpdateID = input.nextInt();
                    input.nextLine();
                    System.out.print("Update new Name : ");
                    String Name = input.nextLine();
                    System.out.print("Update Salary : ");
                    Integer Salary = input.nextInt();
                    input.nextLine();
                    System.out.print("Update Department : ");
                    String Dep = input.nextLine();

                    // use function replace to update data
                    employeesID.replace(UpdateID, UpdateID);
                    employeesName.replace(UpdateID, Name);
                    employeesSalary.replace(UpdateID, Salary);
                    employeesDepartment.replace(UpdateID, Dep);

                    System.out.println("Update successfully ... !");
                    System.out.println();
                    break;
                case "e":
                    System.out.println("<= Search Employee by ID =>");

                    System.out.println("Enter ID to Search :");
                    Integer searchID = input.nextInt();

                    // search ID that contain then display
                    if (employeesID.containsKey(searchID)) {
                        System.out.println("ID: " + searchID + " Name: " + employeesName.get(searchID) +
                                " Salary: " + employeesSalary.get(searchID) + " Department: "
                                + employeesDepartment.get(searchID));
                    }
                    break;
                case "f":
                    // exit program
                    System.out.println("You Are Exit ... ! ");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option.");

            }

        }
        input.close();
    }

}
