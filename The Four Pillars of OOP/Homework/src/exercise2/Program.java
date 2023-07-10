package exercise2;
class PhdStudent extends Student {
    //create constructure with super key
    PhdStudent(String name, int age, String gender, String major) {
        super(name, age, gender, major);
        System.out.println("----PhdStudent---");
    }
    public String getName (){
        return this.name;
    }
    public int getAge () {
        return this.age;
    }

   public String setGender(){
        return this.gender;
   }
    public String getMajor(){
        return this.major;
    }
    public void takeExam(){
        System.out.println("you need to exam final  defense presentations ... ");
    }
}

class GradStudent extends Student {
    //create constructure with super key
    GradStudent(String name, int age, String gender, String major) {
        super(name, age, gender, major);
        System.out.println("----GradStudent-----");
    }
    public String getName (){
        return this.name;
    }
    public int getAge () {
        return this.age;
    }

    public String setGender(){
        return this.gender;
    }
    public String getMajor(){
        return this.major;
    }
    public void takeExam(){
        System.out.println(" graduate students give written papers.");
    }
}
public class Program {
    public static void main(String[] args) {
    GradStudent stu1 = new GradStudent("VEha",19,"Male","ITE");
    stu1.takeExam();

        System.out.println("---------------------------------------");
        
    PhdStudent stu2 = new PhdStudent("Rithy" , 20,"Male", "ITE");
    stu2.takeExam();
    }

}
