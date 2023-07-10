package exercise6;

//class Person have 3 field
public class Person {
    String name;
    int age;
    String gender;
    //method to print all field
    void person(String name , int age , String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("Name : " + name + " Age :" + age + " Gender : " + gender);
    }
}
