package Spring2025_FinalExamReview.BankingSystem;

class Checking extends Account{
    public Checking(double balance) {
        super(balance);
    }

    @Override
    public double withdraw(double amount){
        double accountBalance = super.withdraw(amount);
        if (accountBalance < 0) {
            System.out.println("Charging an overdraft fee of $20 because account is below $0.");
            accountBalance = super.withdraw(20);
        }
        return  accountBalance;
    }

    @Override
    public String toString(){
        return "Checking Account #" + getNumber() + ", Balance $" + getBalance();
    }
    
}
