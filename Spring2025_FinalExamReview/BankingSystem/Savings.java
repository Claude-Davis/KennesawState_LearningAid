class Savings extends Account{
    private int numberOfDeposits = 0;

    public Savings(double accountBalance) {
        super(accountBalance);
    }

    @Override
    public double withdraw(double amount) {
        double accountBalance = super.withdraw(amount);
        if (accountBalance < 500){
            System.out.println("\nCharging a fee of $10 because you are below $500.");
            accountBalance -= 10;
        }
        return accountBalance;
    }

    @Override
    public double deposit(double amount) {
        double accountBalance = super.deposit(amount);
        this.numberOfDeposits++;
        System.out.println("This is deposit " + numberOfDeposits + " to this account.");
        if (numberOfDeposits > 5){
            System.out.println("\n  Charging a fee of $10 because you have made more than 5 deposits.");
            accountBalance -= 10;
        }
        return accountBalance;
    }

    public double addInterest(){
        double accountBalance = getAccountBalance();
        double interest = 0.015 * accountBalance;
        System.out.println("Customer has earned $" + interest + " in interest.");
        deposit(interest);
        return accountBalance;
    }

    @Override
    public String toString(){
        return "Savings Account #" + getAccountNumber() + ", Balance $" + getAccountBalance();
    }
}