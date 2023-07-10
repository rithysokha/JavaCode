package exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        Person person = new Person("Wayha", "Phnom Penh", "+123456787",
                "wayha123@gmail.com" );

        Student student = new Student("Rithy", "Phnom Penh", "+123456788",
                "rithy123@gmail.com", Status.sophomore);

        MyDate dateHired = new MyDate(18 , "jan" , 2023);

        Employee employee = new Employee("Sunneng", "Takeo" , "+123456789",
                "sunneng123@gmail", "Center", 1340.88 , dateHired);

        FacultyMember facultyMember = new FacultyMember(10 , "manager");

        Staff staff = new Staff("Teacher");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(facultyMember);
        System.out.println(staff);
    }
}

//define a parent class
class Person {
    //set protected to allow only child class can access
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    //default constructor
    public Person(){}

    //constructor with parameters
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    //       Override the toString()method in class to display
    @Override
    public String toString() {
        return  '\n' + "Person[" + '\n' +
                " name='" + name + '\'' + '\n' +
                " address='" + address + '\'' + '\n' +
                " phoneNumber='" + phoneNumber + '\'' + '\n' +
                " emailAddress='" + emailAddress + '\'' + '\n' +
                ']';
    }
}

//child class inherit from Person
class Student extends Person {
    //set private to avoid access from other class
    private String status;

    public Student() {
    }

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        //access parent's data field
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    @Override
    public String toString() {
        return  '\n' + "Student[" + '\n' +
                " name='" + name + '\'' + '\n' +
                " address='" + address + '\'' + '\n' +
                " phoneNumber='" + phoneNumber + '\'' + '\n' +
                " emailAddress='" + emailAddress + '\'' + '\n' +
                " status='" + status + '\'' + '\n' +
                ']'+  '\n';
    }

}

 class  Status {
    public static final String freshman = "Freshman";
    public static final String sophomore = "Sophomore";
    public static final String junior = "Junior";
    public static final String senior = "Senior";
}

//inherit from Person
 class Employee extends Person {
    private String office;
    private double salary;
    private MyDate myDate;
    private FacultyMember facultyMember;
    private Staff staff;

    Employee(){}
    Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
                    MyDate myDate) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.myDate = myDate;
    }

    @Override
    public String toString() {
        return  "Employee[" + '\n' +
                " name='" + name + '\'' + '\n' +
                " address='" + address + '\'' + '\n' +
                " phoneNumber='" + phoneNumber + '\'' + '\n' +
                " emailAddress='" + emailAddress + '\'' + '\n' +
                " office='" + office + '\'' + '\n' +
                " salary='" + salary + '\'' + '\n' +
                " myDate='" + myDate + '\'' + '\n' +
                ']'+ '\n' ;
    }
}

 class FacultyMember extends Employee{
    private int officeHour;
    private String position;

    FacultyMember(int officeHour, String position){
        this.officeHour = officeHour;
        this.position = position;
    }
    @Override
    public String toString() {
        return "FacultyMember[" + '\n' +
                " officeHour=" + officeHour + '\n' +
                " position='" + position + '\'' + '\n' +
                ']' +  '\n';
    }
}

 class Staff extends Employee{
    private String title;

    Staff(String title){
        this.title = title;
    }
    @Override
    public String toString() {
        return  "Staff[" + '\n' +
                " title='" + title + '\'' + '\n' +
                ']' + '\n' ;
    }
}

 class MyDate {
    private int date;
    private String month;
    private int year;

    MyDate(int date, String month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }
    @Override
    public String toString() {
        return "MyDate[" + '\n' +
                '\t' + '\t' + "        date='" + date + '\'' + '\n' +
                '\t' + '\t' + "        month='" + month + '\'' + '\n' +
                '\t' + '\t' + "        year=" + year +
                ']';
    }
}
