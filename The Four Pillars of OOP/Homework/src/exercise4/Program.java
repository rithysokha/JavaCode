package exercise4;

import java.util.Scanner;

public class Program {
    static void displayMenu() {
        System.out.println("Please choose the menu below: ");
        System.out.println("A. Create account");
        System.out.println("B. Transfer money");
        System.out.println("C. Check the account balance");
        System.out.println("D. Generate report");
        System.out.println("E. Exit");

    }

    public static void main(String[] args) throws Exception {
        //create empty object to call method from BankAccount class
        BankAccount bankAccountObj = new BankAccount(null, 0, 0){

        };
        Scanner input = new Scanner(System.in);
        String username = "";
        double balance = 0;
        int password = 0;
        boolean exit = false;
        bankAccountObj.displayLine();
        displayMenu();
        while (!exit) {
            char menu = input.next().charAt(0);
            input.nextLine();
            switch (menu) {
                case 'a', 'A':
                    bankAccountObj.displayLine();
                    System.out.println("Pease enter username ");
                    username = input.nextLine();
                    bankAccountObj.displayLine();
                    System.out.println("Please enter password ");
                    password = input.nextInt();
                    bankAccountObj.displayLine();
                    System.out.println("You must deposite money to create account.");
                    System.out.println("How much do you want to deposite?");
                    balance = input.nextDouble();
                    // user id is auto generate from 1
                    bankAccountObj.userAccounts.put(bankAccountObj.userAccounts.size() + 1,
                            bankAccountObj.createBankAccount(username, balance, password));
                    bankAccountObj.displayLine();
                    displayMenu();
                    break;
                case 'b', 'B':
                    bankAccountObj.displayLine();
                    System.out.println("Enter origin account");
                    int accountNumber = input.nextInt();
                    bankAccountObj.displayLine();
                    System.out.println("Enter the receiver account");
                    int accountNumberTransfer = input.nextInt();
                    bankAccountObj.displayLine();
                    System.out.println("Enter the ammount to transfer");
                    double ammountTransfer = input.nextDouble();
                    System.out.println("Enter origin account password: ");
                    int passwordOrigin = input.nextInt();
                    bankAccountObj.transfer(accountNumber, accountNumberTransfer, ammountTransfer, passwordOrigin);
                    bankAccountObj.displayLine();
                    displayMenu();
                    break;
                case 'c', 'C':
                    bankAccountObj.displayLine();
                    System.out.println("Please enter the account number: ");
                    int accountNum = input.nextInt();
                    bankAccountObj.checkBalance(accountNum);
                    bankAccountObj.displayLine();
                    displayMenu();
                    break;
                case 'd', 'D':
                    bankAccountObj.displayLine();
                    bankAccountObj.gemerateReport();
                    displayMenu();

                    break;
                case 'e', 'E':
                    exit = true;
                    break;

                default:
                    bankAccountObj.displayLine();
                    System.out.println("Incalid choise");
                    displayMenu();
                    break;
            }
        }
        input.close();
    }
}
