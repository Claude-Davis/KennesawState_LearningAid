package Spring2025_FinalExamReview.BankingSystem;

class Account {
    private int accountNumber;
    private static int nextNumber=10001;
    private double accountBalance;

    public Account(){
        this.accountNumber = nextNumber;
        nextNumber++;
        this.accountBalance = 0;
    }

    public Account (double accountBalance){
        this.accountBalance = accountBalance;
    }

    public double withdraw(double amount) {
        accountBalance -= amount;
        return  accountBalance;
    }

    public double deposit(double amount) {
        accountBalance += amount;
        return  accountBalance;
    }

    public double getBalance() {
        return accountBalance;
    }

    public int getNumber() {
        return  accountNumber;
    }

    @Override
    public String toString() {
        return "Account #" + accountNumber + ", Balance $" + accountBalance;
    }
}
