class Account {
    private int accountNumber;
    private static int nextNumber = 10001;
    private double accountBalance;

    public Account(){
        this.accountNumber = nextNumber;
        this.nextNumber++;
        this.accountBalance = 0;
    }

    public Account(double x){
        this.accountNumber = nextNumber;
        this.nextNumber++;
        this.accountBalance = x;
    }

    public double withdraw(double y){
        this.accountBalance -= y;
        return accountBalance;
    }

    public double deposit(double z){
        this.accountBalance += z;
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
    public Checking(double accountBalance){
        //passes the argument to its superclass overloaded constructor
        super(accountBalance); //super() calls the parent class
    }

    @Override //requirement to override: must declare the same function header
    public double withdraw(double amountC) {
        double accountBalance = super.withdraw(amountC); //super. calls the parent class['s withdraw method]
        if (accountBalance < 0) {
            accountBalance = super.withdraw(20);
        }
        return accountBalance;
    }

    @Override
    public String toString(){
        return "Checking Account #" + accountNumber + ", balance $" + accountBalance;
    }
}


//subclass "Savings"
class Savings extends Account() {
    private int numberOfDeposits = 0;

    public Savings(double accountBalance){
        //passes the argument to its superclass overloaded constructor
        super(accountBalance); //super() calls the parent class
    }

    @Override
    public double withdraw(double amountS){
        double accountBalance = super.withdraw(amountS);  //super. calls the parent class['s withdraw method]
        if (accountBalance < 500) {
            System.out.println("Charging a fee of $10 because you are below $500.");
            accountBalance -= 10;
        }
        return accountBalance;
    }

    @Override
    public double deposit(double amountS) {
        double accountBalance = super.deposit(amountS);
        this.numberOfDeposits++;
        
        System.out.println("This is deposit " + numberOfDeposits + " to this account.");
        if (numberOfDeposits > 5) {
            System.out.println("Charging a fee of $10.") {
                accountBalance -= 10;
            }
        }

        return accountBalance;
    }

    public double addInterest() {
        double accountBalance;
        double interest = 0.015 * accountBalance; //interest in 1.5%
        System.out.println("Customer has earned $" + interest + " in interest.");
        accountBalance += interest;
        return accountBalance;
    }

    @Override
    public String toString() {
        return "Savings Account #" + accountNumber + ", balance $" + accountBalance;
    }
}
