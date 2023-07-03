package exercise6;

//class Employee as child class of class Person
class Employee extends Person {
    private int employeeId;
    private String jobTitle;
    private int salary;
    void employee(int employeeId, String jobTitle, int salary){
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
        System.out.println("ID " + employeeId + " Position "  + jobTitle + " Salary " + salary +"$");
    }
}
//Class Customer as subclass of class person
class Customer extends Employee {
    private String address;
    private String phoneNumber;
    private int customerId;

    void customer(int customerID, String address, String phoneNumber){
        this.customerId = customerID;
        this.address = address;
        this.phoneNumber = phoneNumber;
        System.out.println("ID " + customerID + " Address " + address + " Tel: " + phoneNumber);
    }
}
class Program{
    public static void main(String[] args) {
        //create obj to call method
        Customer  customer = new Customer();
        customer.customer(1, "ToulKok" , "01243422" );

        Employee employee = new Employee();
        employee.employee( 101, "IT-Engineer", 500);

        Person person = new Person();
        person.person("Veha" , 21 , "Male");

        System.out.println("--------------------------------------");

        customer.person("Veha" , 21 , "Male");
        customer.employee(101, "IT-Engineer", 500);

    }
}