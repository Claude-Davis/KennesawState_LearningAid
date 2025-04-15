class Checking extends Account{
    public Checking (double accountBalance){
        super(accountBalance);
    }

    @Override
    public double withdraw (double amount){
        double accountBalance = super.withdraw(amount);
        if (accountBalance < 0){
            System.out.println("Charging overdraft fee of $20 because account is below $0.");
            accountBalance -= 20;
        }
        return accountBalance;
    }

    @Override
    public String toString(){
        return "\n Checking Account #" + getAccountNumber() + ", Balance $" + getAccountBalance();
    }
}