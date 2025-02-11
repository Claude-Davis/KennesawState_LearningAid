//prompt: https://www.kennesaw.edu/ccse/first-year-experience/cse1322l/labs/1322l-lab-5-v1.pdf

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Savings saveAcc = new Savings();
        Checking checkAcc = new Checking();

        //title
        System.out.println("[]");
        System.out.println(" ");

        //initialize "option"
        int option = 0;

        saveAcc.getAccountBalance() = 500;

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

                option = scan.nextInt();

                switch (option){
                    case 1:
                        System.out.print("How much would you like to withdraw from checking? ");
                        double amountC = scan.nextDouble();

                        System.out.println("Current balance of checking is $" + checkAcc.getAccountBalance());
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                }
        }
        System.out.println("Shutting off...");
    }
}