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
        Scanner input = new Scanner(System.in);
        String username = "";
        double balance = 0;
        int password = 0;
        boolean exit = false;
        BankAccount.displayLine();
        displayMenu();
        while (!exit) {
            char menu = input.next().charAt(0);
            input.nextLine();
            switch (menu) {
                case 'a', 'A':
                    BankAccount.displayLine();
                    System.out.println("Pease enter username ");
                    username = input.nextLine();
                    BankAccount.displayLine();
                    System.out.println("Please enter password ");
                    password = input.nextInt();
                    BankAccount.displayLine();
                    System.out.println("You must deposite money to create account.");
                    System.out.println("How much do you want to deposite?");
                    balance = input.nextDouble();
                    // user id is auto generate from 1
                    BankAccount.userAccounts.put(BankAccount.userAccounts.size() + 1,
                            BankAccount.createBankAccount(username, balance, password));
                    BankAccount.displayLine();
                    displayMenu();
                    break;
                case 'b', 'B':
                    BankAccount.displayLine();
                    System.out.println("Enter origin account");
                    int accountNumber = input.nextInt();
                    BankAccount.displayLine();
                    System.out.println("Enter the receiver account");
                    int accountNumberTransfer = input.nextInt();
                    BankAccount.displayLine();
                    System.out.println("Enter the ammount to transfer");
                    double ammountTransfer = input.nextDouble();
                    System.out.println("Enter origin account password: ");
                    int passwordOrigin = input.nextInt();
                    BankAccount.transfer(accountNumber, accountNumberTransfer, ammountTransfer, passwordOrigin);
                    BankAccount.displayLine();
                    displayMenu();
                    break;
                case 'c', 'C':
                    BankAccount.displayLine();
                    System.out.println("Please enter the account number: ");
                    int accountNum = input.nextInt();
                    BankAccount.checkBalance(accountNum);
                    BankAccount.displayLine();
                    displayMenu();
                    break;
                case 'd', 'D':
                    BankAccount.displayLine();
                    BankAccount.gemerateReport();
                    displayMenu();

                    break;
                case 'e', 'E':
                    exit = true;
                    break;

                default:
                    BankAccount.displayLine();
                    System.out.println("Incalid choise");
                    displayMenu();
                    break;
            }
        }
        input.close();
    }
}
