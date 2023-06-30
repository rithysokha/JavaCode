package exercise4;
import java.util.HashMap;

public class BankAccount {
    private int accountNumber;
    private String username;
    private double balance;
    private int password;

    //user setter and getter becasue of private variables
    int getAccountNumber() {
        return accountNumber;
    }

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    String getUsername() {
        return username;
    }

    void setUsername(String username) {
        this.username = username;

    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void abstractBalance(double balance, double balanceOut) {
        this.balance = balance - balanceOut;
    }

    void addBalance(double balance, double balanceIn) {
        this.balance = balance + balanceIn;
    }
    
    boolean greaterBalance(double balanceOut) {
        return this.balance >= balanceOut;
    }

    int getPassword() {
        return password;
    }

    void setPassword(int password) {
        this.password = password;
    }
    //constructor
    BankAccount(String username, double balance, int password) {

        this.username = username;
        this.balance = balance;
        this.password = password;
    }

    static void displayLine() {
        System.out.println("---------------------------------------------");
    }

    // object method to store username balance and password
    public static BankAccount createBankAccount(String username, double balance, int password) {
        return new BankAccount(username, balance, password);
    }

    // account number as the key
    public static HashMap<Integer, BankAccount> userAccounts = new HashMap<>();

    // check balance
    static void checkBalance(int accountNum) {
        System.out.println(userAccounts.get(accountNum).getBalance());
    }
    // method to transfer
    static void transfer(int accountNumber, int accountNumberTransfer, double ammountTransfer) {
        if (userAccounts.containsKey(accountNumber) && (userAccounts.containsKey(accountNumberTransfer))) {
            if (userAccounts.get(accountNumber).greaterBalance(ammountTransfer)) {
                userAccounts.get(accountNumberTransfer).addBalance(userAccounts.get(accountNumberTransfer).getBalance(),
                        ammountTransfer);
                userAccounts.get(accountNumber).abstractBalance(userAccounts.get(accountNumber).getBalance(),
                        ammountTransfer);
            } else
                System.out.println("The sender has insufficient balance.");
        } else
            System.out.println("Invalid account number ");
    }

   static void gemerateReport(){
        double totalAsset=0;
        displayLine();
        System.out.println("Bank financial report");
        System.out.println("Total customer: "+userAccounts.size());
        for(int i=1; i<= userAccounts.size(); i++){
          totalAsset += userAccounts.get(i).getBalance();
        }
        System.out.println("Total asset: " +totalAsset);
    }
}
