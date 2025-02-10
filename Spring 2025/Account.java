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

    public String toString(){
        //@Override;
        return "Account #" + accountNumber + ", balance $" + accountBalance;
    }

    //subclass "Checking"
    class Checking {
        public Checking(double c){
            //passes the argument to its superclass overloaded constructor
        }

        public double withdraw(double w) {
            //@Override
            //
        }
    }
}
