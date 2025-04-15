import java.util.Scanner;

class Driver {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        Checking checking = new Checking(0);
        Savings savings = new Savings(500);

        System.out.println("[Banking System]");
        int option=0;

        while (option!=8){
            //menu
            System.out.println("1. Withdraw from Checking");
            System.out.println("2. Withdraw from savings");
            System.out.println("3. Deposit to Checking");
            System.out.println("4. Deposit to Savings");
            System.out.println("5. See Balance of Checking");
            System.out.println("6. See Balancre of Savings");
            System.out.println("7. Award Interest to Savings");
            System.out.println("8. Quit");

            System.out.print("Enter option: ");
            option = scan.nextInt();

            System.out.println(" ");

            switch (option){
                default:
                    if (option !=8){
                        System.out.println("Invalid entry");
                    }
                    break;

                case 1:  //withdraw from checking
                    System.out.print("Enter an Amount to Withdraw: $");
                    int withdrawalAmount = scan.nextInt();

                    checking.withdraw(withdrawalAmount);

                    System.out.println("Current Balance of Checking: $" + checking.getAccountBalance());
                    System.out.println(" ");
                    break;

                case 2:  //withdraw from savings
                    System.out.print("Enter an Amount to Withdraw: $");
                    withdrawalAmount = scan.nextInt();

                    savings.withdraw(withdrawalAmount);

                    System.out.println("Current Balance of Savings: $" + savings.getAccountBalance());
                    System.out.println(" ");
                    break;

                case 3:  //deposit to checking
                    System.out.print("Enter an Amount to Deposit: $");
                    int depositAmount = scan.nextInt();

                    checking.deposit(depositAmount);

                    System.out.println("Current Balance of Checking: $" + checking.getAccountBalance());
                    System.out.println(" ");
                    break;

                case 4:  //deposit to savings
                    System.out.print("Enter an Amount to Deposit: $");
                    depositAmount = scan.nextInt();

                    savings.deposit(depositAmount);

                    System.out.println("Current Balance of Savings: $" + savings.getAccountBalance());
                    System.out.println(" ");
                    break;

                case 5:  //get checking balance
                    System.out.println(checking.toString());

                    System.out.println(" ");
                    break;

                case 6:
                    System.out.println(savings.toString());

                    System.out.println(" ");
                    break;
                case 7:
                    System.out.println(savings.addInterest());
                    System.out.println("Current Balance of Savings: $" + savings.getAccountBalance());

                    System.out.println(" ");
                    break;
            }
        }
        System.out.println("Shutting off...");
    }
}