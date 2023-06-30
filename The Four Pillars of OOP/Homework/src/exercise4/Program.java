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
        BankAccount.userAccounts.put(1, BankAccount.createBankAccount("Tha", 3000, 1234));
        BankAccount.userAccounts.put(2, BankAccount.createBankAccount("Thy", 2000, 1234));
        Scanner input = new Scanner(System.in);
        BankAccount.displayLine();
        displayMenu();
        // char menu = input.next().charAt(0);
        // input.nextLine();

        boolean exit = false;
        String username = "";
        double balance = 0;
        int password = 0;
        switch ('d') {
            case 'a', 'A':
                System.out.println("Pease enter username ");
                username = input.nextLine();
                System.out.println("Please enter password ");
                password = input.nextInt();
                System.out.println("Please re-enter password");
                System.out.println("You must deposite money to create account.");
                System.out.println("How much do you want to deposite?");
                balance = input.nextDouble();
                BankAccount.userAccounts.put(1, BankAccount.createBankAccount(username, balance, password));
                System.out.println(BankAccount.userAccounts.get(1).getBalance());

                break;
            case 'b', 'B':
                BankAccount.transfer(1, 2, 3500);
                System.out.println(BankAccount.userAccounts.get(1).getBalance());
                System.out.println(BankAccount.userAccounts.get(2).getBalance());

                break;
            case 'c', 'C':
                System.out.println("Please enter the account number: ");
                int accountNum = input.nextInt();
                BankAccount.checkBalance(accountNum);
                break;
            case 'd', 'D':
                BankAccount.gemerateReport();
                break;
            case 'e', 'E':
                exit = true;
                break;

            default:
                System.out.println("Incalid choise");
                break;
        }

    }
}
