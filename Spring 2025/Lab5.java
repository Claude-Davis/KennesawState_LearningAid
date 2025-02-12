//prompt: https://www.kennesaw.edu/ccse/first-year-experience/cse1322l/labs/1322l-lab-5-v1.pdf

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Savings saveAcc = new Savings();
        Checking checkAcc = new Checking();

        //title
        System.out.println("[Banking System]");
        System.out.println(" ");

        //initialize "option"
        int option = 0;

        while (option != 8){
                //menu
                System.out.println("1. Withdraw from Checking");
                System.out.println("2. Withdraw from Savings"); 
                System.out.println("3. Deposit to Checking");
                System.out.println("4. Deposit to Savings");
                System.out.println("5. Balance of Checking");
                System.out.println("6. Balance of Savings");
                System.out.println("7. Award Interest to Savings");
                System.out.println("8. Quit");

                System.out.print("Select Option: ");
                option = scan.nextInt();

                System.out.print(" ");

                switch (option){
                    case 1:
                        System.out.print("How much would you like to withdraw from checking? ");
                        double amountC = scan.nextDouble();

                        checkAcc.withdraw(amountC);

                        System.out.println("Current balance of checking is $" + checkAcc.getAccountBalance());

                        System.out.println(" ");
                        break;
                    case 2:
                        System.out.print("How much would you like to withdraw from Savings? ");
                        double amountS = scan.nextDouble();

                        saveAcc.withdraw(amountS);

                        System.out.println("Current balance of Savings is $" + saveAcc.getAccountBalance());
                            
                        System.out.println(" ");
                        break;
                    case 3:
                        System.out.print("How much would you like to deposit to Checking? $");
                        double amount = scan.nextDouble();

                        checkAcc.deposit(amount);

                        System.out.println("Current balance of Checking is $" + checkAcc.getAccountBalance());

                        System.out.println(" ");
                        break;
                    case 4:
                        System.out.print("How much would you like to deposit to Savings? $");
                        amountS = scan.nextDouble();

                        saveAcc.deposit(amountS);

                        System.out.println("Current balance of Savings is $" + saveAcc.getAccountBalance());

                        System.out.println(" ");
                        break;
                    case 5:
                        checkAcc.toString();

                        System.out.println(" ");
                        break;
                    case 6:
                        saveAcc.toString();

                        System.out.println(" ");
                        break;
                    case 7:
                        System.out.println("Current balance of Savings is $" + saveAcc.addInterest());

                        System.out.println(" ");
                        break;
                }
        }
        System.out.println("Shutting off...");
    }
}