import java.math.*;
import java.util.Scanner;


public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private BigDecimal balance;

    private static long nextAccountNumber;

    public static long nextNumber() {
        return nextAccountNumber++;
    }

    public void setData(String ownerName, BigDecimal balance) {
        this.accountNumber = getAccountNumber();
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);

        return this.balance;
    }

    public boolean withDraw(BigDecimal amount){
        if(amount.compareTo(this.balance) == 1 || amount.compareTo(this.balance) == 0){
            return false;
        } else {
            balance = balance.subtract(amount);
            return true;
        }
    }

}

class CreateAccount {
    public static BankAccount createNewBankAccount(String ownerName, BigDecimal balance) {
        BankAccount newAccount = new BankAccount();

        newAccount.setData(ownerName, balance);

        return newAccount;
    }

    public static void depositTest(BankAccount account) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to deposit");
        BigDecimal amount = new BigDecimal(scanner.nextInt());
        account.deposit(amount);

    }

    public static void TestWithDraw(BankAccount account){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw : ");
        BigDecimal amount = new BigDecimal(scanner.next());
        if(!account.withDraw(amount)){
            System.out.println("Insufficient funds!");
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount1 = CreateAccount.createNewBankAccount("Vesper Lind", new BigDecimal("0.0"));
        printBankAccount(bankAccount1);
        depositTest(bankAccount1);
        printBankAccount(bankAccount1);

        TestWithDraw(bankAccount1);

        BankAccount bankAccount2 = CreateAccount.createNewBankAccount("Celine", new BigDecimal(0.0));
        printBankAccount(bankAccount2);
        depositTest(bankAccount2);
        printBankAccount(bankAccount2);

        TestWithDraw(bankAccount2);
        
    }

    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());
    }
}