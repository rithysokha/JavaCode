
//group8
import java.util.HashMap;
import java.util.Scanner;

class Account {
    public String name;
    double balance;
    int password;

    Account(String name, double balance, int password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

}

class Operations {
    public static void displayLine() {
        System.out.println("----------------------------------------------------");
    }

    // method to check the entered account
    static boolean enterAccount(int accNum) {
        if (Exercise3.userAccounts.containsKey(accNum)) {
            displayLine();
            System.out.println("Account holder name: " + Exercise3.userAccounts.get(accNum).name);
            displayLine();
            return true;
        } else {
            displayLine();
            System.out.println("Invalid account number");
            displayLine();
            return false;
        }
    }

    // method to check the entered password
    static boolean enterPassword(int accountNum, int password) {
        if (password == Exercise3.userAccounts.get(accountNum).password) {
            return true;
        } else {
            System.out.println("Invalid password");
            displayLine();
            return false;
        }
    }

    // method to check if user have enough balance to do transaction
    static boolean checkBalance(int accountNum, double balanceOut) {
        return Exercise3.userAccounts.get(accountNum).balance <= balanceOut;
    }

    // method to check user balance
    static int displayBalance(int accNum) {
        displayLine();
        System.out.println("Your balance is: " + Exercise3.userAccounts.get(accNum).balance + " $");
        displayLine();
        return accNum;
    }

    // method to do withdraw
    static double withdraw(int accountNum, double ammount) {
        double ammountOut = 0;
        displayLine();
        if (checkBalance(accountNum, ammountOut)) {
            ammountOut = Exercise3.userAccounts.get(accountNum).balance -= ammount;
        } else {
            System.out.println("You have insufficient balance!");
        }
        displayLine();
        return ammountOut;
    }

    // method to do the deposite
    static double deposite(int accountNum, double ammount) {
        displayLine();
        return Exercise3.userAccounts.get(accountNum).balance += ammount;
    }

    // method to to the transfer
    static double transfer(int accountNum, int accountNumTransfer, double ammount) {
        double ammountOut = 0;
        displayLine();
        if (checkBalance(accountNum, ammountOut)) {
            if (accountNum != accountNumTransfer) {
                ammountOut = Exercise3.userAccounts.get(accountNumTransfer).balance += ammount;
                withdraw(accountNum, ammount);
            } else
                System.out.println("You can't transfer to your own account");
        } else {
            System.out.println("You have insufficient balance");
        }
        displayLine();
        return ammountOut;
    }

    // method to display menu
    static void displayMenu() {
        System.out.println("Please choose the service by type character: ");
        displayLine();
        System.out.println("A: Balance");
        System.out.println("B: Withdraw");
        System.out.println("C: Deposite");
        System.out.println("D: Transfer");
        System.out.println("E: Exit");
    }
}

public class Exercise3 {
    public static HashMap<Integer, Account> userAccounts = new HashMap<>();

    public static void main(String[] args) throws Exception {

        userAccounts.put(1001, new Account("Pich", 1000, 1234));
        userAccounts.put(1002, new Account("Da", 2000, 2345));
        userAccounts.put(1003, new Account("Noy", 3000, 3456));
        userAccounts.put(1004, new Account("Tev", 4000, 4567));
        userAccounts.put(1005, new Account("Johhny", 5000, 5678));

        Operations.displayLine();
        System.out.println("Hello! Welcome to our bank.");
        Operations.displayLine();
        Scanner input = new Scanner(System.in);
        int accountNum = 0;
        int password = 0;
        boolean invalidAccount = true;
        boolean invalidPassword = true;
        while (invalidAccount) {
            System.out.println("Please enter your account number");
            accountNum = input.nextInt();
            if (Operations.enterAccount(accountNum)) {
                invalidAccount = false;
                while (invalidPassword) {
                    System.out.println("Enter your password");
                    password = input.nextInt();
                    Operations.displayLine();
                    if (Operations.enterPassword(accountNum, password)) {
                        invalidPassword = false;
                        boolean exit = false;
                        while (!exit) {
                            Operations.displayMenu();
                            char menuCase = input.next().charAt(0);
                            double ammount = 0;
                            switch (menuCase) {
                                case 'a', 'A':
                                    Operations.displayBalance(accountNum);
                                    break;
                                case 'b', 'B':
                                    System.out.println("How much do you want to withdraw?");
                                    ammount = input.nextDouble();
                                    Operations.withdraw(accountNum, ammount);
                                    break;
                                case 'c', 'C':
                                    System.out.println("Insert your note: ");
                                    ammount = input.nextDouble();
                                    Operations.deposite(accountNum, ammount);
                                    break;
                                case 'd', 'D':
                                    System.out.println("Please enter the reciver account number");
                                    int accountNumTransfer = input.nextInt();
                                    System.out.println("How much do you want to transfer?");
                                    ammount = input.nextDouble();
                                    System.out.println("Please enter your password");
                                    password = input.nextInt();
                                    if (Operations.enterPassword(accountNum, password)
                                            && Operations.enterAccount(accountNumTransfer)) {
                                        Operations.transfer(accountNum, accountNumTransfer, ammount);
                                    } else
                                        System.out.println("Failed");
                                    break;
                                case 'e', 'E':
                                    exit = true;
                                    break;
                                default:
                                    System.out.println("Invalid choise");
                            }
                        }
                    }
                }
            }
        }
        input.close();
    }
}