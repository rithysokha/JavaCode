
//group8
import java.util.Scanner;
import static java.lang.Math.pow;

public class Exercise2 {
    // This class represents a calculator that can perform basic arithmetic
    // operations.

    double num1;
    double num2;
    Character operator;

    // Constructor that takes the two numbers and the operator as input.
    Exercise2(double num1, double num2, Character operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    // Methods that perform the basic arithmetic operations.
    public double add() {
        return this.num1 + this.num2;
    }

    public double subtract() {
        return this.num1 - this.num2;
    }

    public double multiple() {
        return this.num1 * this.num2;
    }

    public double divide() {
        return this.num1 / this.num2;
    }

    public double power() {
        return pow(num1, num2);
    }

    public double module() {
        return this.num1 % this.num2;
    }

    // Method that displays the result of the calculation.
    public void display() {
        if (this.operator == '+') {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + add());
        } else if (this.operator == '-') {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + subtract());
        } else if (this.operator == '*') {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + multiple());
        } else if (this.operator == '/') {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + divide());
        } else if (this.operator == '^') {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + power());
        } else if (this.operator == '%') {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + module());
        }
    }
}

class TestPro {
    public static void main(String[] args) {
        // Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the numbers and the operator.
        System.out.println("Enter number1, operator and number2 separated by a Space: ");
        double num1 = input.nextDouble();
        Character operator = input.next().charAt(0);
        double num2 = input.nextDouble();

        // Create a new Calculator object and pass the numbers and the operator to it.
        Exercise2 cal = new Exercise2(num1, num2, operator);

        // Call the display() method to display the result of the calculation.
        cal.display();
    }
}