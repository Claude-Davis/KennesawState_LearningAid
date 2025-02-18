

import java.text.DecimalFormat;

class Account {
    private int accountNumber;
    private static int nextNumber = 10001;
    private double accountBalance;

    public Account(){
        this.accountNumber = nextNumber;
        this.nextNumber++;
        this.accountBalance = 0;
    }

    public Account(double balance){
        this.accountNumber = nextNumber;
        this.nextNumber++;
        this.accountBalance = balance;
    }

    public double withdraw(double amountA){
        this.accountBalance -= amountA;
        return accountBalance;
    }

    public double deposit(double amount){
        this.accountBalance += amount;
        return accountBalance;
    }

    //getter for balance
    public double getAccountBalance(){
        return accountBalance;
    }

    //getter for account #
    public double getAccountNumber(){
        return accountNumber;
    }

    @Override
    public String toString(){
        return "Account #" + accountNumber + ", balance $" + accountBalance;
    }
}

//subclass "Checking"
class Checking extends Account{
    public Checking(){
        //
    }

    public Checking(double accountBalance){
        //passes the argument to its superclass overloaded constructor
        super(accountBalance); //super() calls the parent class
    }

    @Override //requirement to override: must declare the same function header
    public double withdraw(double amountC) {
        double accountBalance = super.withdraw(amountC); //super. calls the parent class['s withdraw method]
        if (accountBalance < 0) {
            System.out.println("Charging an overdraft fee of $20 because account is below $0.");
            accountBalance = super.withdraw(20);
        }
        return accountBalance;
    }

    @Override
    public String toString(){
        return "Checking Account #" + getAccountNumber() + ", balance $" + getAccountBalance();
    }
}


//subclass "Savings"
class Savings extends Account {
    private int numberOfDeposits = 0;

    public Savings(){
        super(500); //starts the account at 500 | saves 500 ro the "balance" variable in the parent ("Account") class
        this.numberOfDeposits = numberOfDeposits;
    }

    public Savings(double accountBalance){
        //passes the argument to its superclass overloaded constructor
        super(accountBalance); //super() calls the parent class
    }

    @Override
    public double withdraw(double amountS){
        double accountBalance = super.withdraw(amountS);  //super. calls the parent class['s withdraw method]
        if (accountBalance < 500) {
            System.out.println("Charging a fee of $10 because you are below $500.");
            accountBalance = super.withdraw(10);
        }
        return accountBalance;
    }

    @Override
    public double deposit(double amountS) {
        double accountBalance = super.deposit(amountS);
        this.numberOfDeposits++;
        
        System.out.println("This is deposit " + numberOfDeposits + " to this account.");
        if (numberOfDeposits > 5) {
            System.out.println("Charging a fee of $10.");
            accountBalance = super.withdraw(10);
        }

        return accountBalance;
    }

    public double addInterest() {
        DecimalFormat df = new DecimalFormat("0.00");

        double interest = 0.015 * getAccountBalance();
        System.out.println("Customer has earned $" + df.format(interest) + " in interest.");
        return super.deposit(interest); //calls parent class's deposit method to avoid increasing "numberOfDeposits"
    }

    @Override
    public String toString() {
        return "Savings Account #" + getAccountNumber() + ", balance $" + getAccountBalance();
    }
}
