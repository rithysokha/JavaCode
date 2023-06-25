//group8
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {

    public static void main(String[] args) {

        // main hashmap to store all data
        // acc number password name balance
        HashMap<Integer, HashMap<Integer, HashMap<String, Integer>>> bankAccount = new HashMap<>();

        // store user ID amd password
        bankAccount.put(1, new HashMap<>());
        bankAccount.put(2, new HashMap<>());
        bankAccount.put(3, new HashMap<>());
        bankAccount.put(4, new HashMap<>());
        bankAccount.put(5, new HashMap<>());

        // store user password
        bankAccount.get(1).put(1234, new HashMap<>());
        bankAccount.get(2).put(2345, new HashMap<>());
        bankAccount.get(3).put(3456, new HashMap<>());
        bankAccount.get(4).put(4567, new HashMap<>());
        bankAccount.get(5).put(5678, new HashMap<>());

        // store username and balance
        bankAccount.get(1).get(1234).put("Teav", 10000);
        bankAccount.get(2).get(2345).put("Tum", 20000);
        bankAccount.get(3).get(3456).put("Chet", 50000);
        bankAccount.get(4).get(4567).put("Buntheun", 30000);
        bankAccount.get(5).get(5678).put("Theavy", 40000);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your account number and password to login: ");
        System.out.print("Account number: ");
        int accNumber = input.nextInt();
        // if user input wrong account number program will end
        if (accNumber >= 1 && accNumber <= 5) {
            // verifying password login
            Set<Integer> keys = bankAccount.get(accNumber).keySet();
            int password = 0;
            // looping through the set keys to convert password to int
            for (int key : keys) {
                boolean wrongPassword = true;
                while (wrongPassword) {
                    System.out.print("Input password: ");
                    password = input.nextInt();
                    if (password == key) {
                        wrongPassword = false;
                    }
                }
            }
            // variable to store balance of the user
            int balance = 0;
            switch (accNumber) {
                case 1:
                    balance = bankAccount.get(accNumber).get(password).get("Teav");
                    break;
                case 2:
                    balance = bankAccount.get(accNumber).get(password).get("Tum");
                    break;
                case 3:
                    balance = bankAccount.get(accNumber).get(password).get("Chet");
                    break;
                case 4:
                    balance = bankAccount.get(accNumber).get(password).get("Buntheun");
                    break;
                case 5:
                    balance = bankAccount.get(accNumber).get(password).get("Theavy");
                    break;
                default:
                    System.out.println("Invalid account");
            }
            // menu for user to choose
            boolean exit = false;
            while (!exit) {
                System.out.println("Menu: ");
                System.out.println("a: Balance");
                System.out.println("b: Withdraw");
                System.out.println("c: Deposite");
                System.out.println("d: Trasfer");
                System.out.println("e: Exit");
                char menu = input.next().charAt(0);
                switch (menu) {
                    case 'a':
                        System.out.println("Your balance is " + balance + "$");
                        break;
                    case 'b':
                        System.out.println("How much do you want to withdraw? ");
                        int ammountOut = input.nextInt();
                        if (ammountOut <= balance) {
                            balance -= ammountOut;
                        } else
                            System.out.println("You have insufficient balance");
                        break;
                    case 'c':
                        System.out.println("Please ensert your note");
                        int ammountIn = input.nextInt();
                        balance += ammountIn;
                        break;
                    case 'd':
                        System.out.println("Please enter the accound number you want to transfer");
                        // acces to account number to transfer
                        int accTransfer = input.nextInt();
                        int peopleBalance = 0; // for calculating balance after transfer
                        int ammountTransfer; // ammount to transfer from user
                        int passwordTransfer;
                        if (accTransfer != accNumber) {
                            switch (accTransfer) {
                                case 1:
                                    peopleBalance = bankAccount.get(accTransfer).get(1234).get("Teav");
                                    break;
                                case 2:
                                    peopleBalance = bankAccount.get(accTransfer).get(2345).get("Tum");
                                    break;
                                case 3:
                                    peopleBalance = bankAccount.get(accTransfer).get(3456).get("Chet");
                                    break;
                                case 4:
                                    peopleBalance = bankAccount.get(accTransfer).get(4567).get("Buntheun");
                                    break;
                                case 5:
                                    peopleBalance = bankAccount.get(accTransfer).get(5678).get("Theavy");
                                    break;
                                default:
                                    System.out.println("Invalid account number");
                            }
                            System.out.println("How much do you want to transfer?");
                            ammountTransfer = input.nextInt();
                            System.out.println("please input your password: ");
                            passwordTransfer = input.nextInt();
                            if (passwordTransfer == password) {
                                if (balance >= ammountTransfer) {
                                    balance -= ammountTransfer;
                                    peopleBalance += ammountTransfer;
                                    System.out.println(peopleBalance);
                                } else
                                    System.out.println("You have insufficient balance");
                            } else
                                System.out.println("Incorrect password");
                            break;
                        } else
                            System.out.println("You can't transfer to your own account!");
                            continue;//if not using continue the program will end here
                    case 'e':
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option!");
                }
            }
            input.close();
            // if user input the wrong account in the first place
        } else
            System.out.println("Invalid account number!");
    }
}
