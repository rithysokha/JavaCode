package exercise2;

abstract class Student {
     String name;
     int age;
     String gender;
     String major;
    Student(String name , int age , String gender , String major){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;

        System.out.println(" Name : " + name + "\n age : "
                + age + "\n Gender : " + gender + "\n Major " + major);
    }

    public abstract String getName();
    public abstract int getAge();

    public abstract String setGender();
    public abstract String getMajor();
    public abstract void takeExam();

}

