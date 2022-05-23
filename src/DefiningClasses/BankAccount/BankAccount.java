package DefiningClasses.BankAccount;

public class BankAccount {
    private static int id = 1;
    private final int accountId;
    private double balance;
    private static double interestRate = 0.02;

    BankAccount(){
        this.accountId = id;
        id++;
        this.balance = 0;
    }

    public static void setInterestRate(double interest){
        interestRate = interest;
    }

    public double getInterest(int years){
        return (this.balance * interestRate) * years;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public int getAccountId(){
        return this.accountId;
    }

}