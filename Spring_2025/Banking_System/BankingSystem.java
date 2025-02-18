

import java.util.Scanner;
import java.text.DecimalFormat;

public class BankingSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00"); //displays every double or float variable to the hundredths place

        Checking checkAcc = new Checking();
        Savings saveAcc = new Savings();

        //title
        System.out.println("[Banking System]");
        System.out.println(" ");

        //initialize "option"
        int option = 0;

        while (option != 8){
                                                                                    //attempt 1: invalid "option" entry check; not-functional
                                                                                    /* if (option > 8 || option < 0) {
                                                                                        System.out.println("Invalid Entry!");
                                                                                    } */

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
                        System.out.println("(Enter '0' to return to menu.)");
                
                        System.out.print("How much would you like to withdraw from checking? $");
                        double amountC = scan.nextDouble();

                        if (amountC > 0){
                            checkAcc.withdraw(amountC);

                            System.out.println("Current balance of checking is $" + df.format(checkAcc.getAccountBalance()));

                            System.out.println(" ");
                        } else if (amountC == 0){  //allow user to return to main menu early/on-command
                            System.out.println(" ");
                            break;
                        } else if (amountC < 0){
                            System.out.println("Invalid Entry.");
                            break; 
                        }

                        break;
                    case 2:
                        System.out.println("(Enter '0' to return to menu.)");

                        System.out.print("How much would you like to withdraw from Savings? $");
                        double amountS = scan.nextDouble();

                        if (amountS > 0){
                            saveAcc.withdraw(amountS);

                            System.out.println("Current balance of Savings is $" + df.format(saveAcc.getAccountBalance()));
                                
                            System.out.println(" ");
                        } else if (amountS == 0){
                            System.out.println(" ");
                            break;
                        } else if (amountS < 0){
                            System.out.println("Invalid Entry.");
                            break;
                        }
                        
                        break;
                    case 3:
                        System.out.println("(Enter '0' to return to menu.)");

                        System.out.print("How much would you like to deposit to Checking? $");
                        double amount = scan.nextDouble();

                        if (amount > 0){
                            checkAcc.deposit(amount);

                            System.out.println("Current balance of Checking is $" + df.format(checkAcc.getAccountBalance()));

                            System.out.println(" ");
                        } else if (amount == 0){ //allow for returning to the main menu
                            System.out.println(" ");
                            break;
                        } else if (amount < 0){ //prevent negative entries
                            System.out.println("No negative numbers.");
                            System.out.println(" ");
                        }

                        break;
                    case 4:
                        System.out.print("How much would you like to deposit to Savings? $");
                        amountS = scan.nextDouble();

                        if (amountS > 0){
                            saveAcc.deposit(amountS);

                            System.out.println("Current balance of Savings is $" + df.format(saveAcc.getAccountBalance()));

                            System.out.println(" ");
                        } else if (amountS == 0){ //allow user to return to main menu
                            System.out.println(" ");
                            break;
                        } else if (amountS < 0){ //prevent negative entries
                            System.out.println("No negative numbers.");
                            System.out.println(" ");
                        }

                        break;
                    case 5:
                        System.out.println(checkAcc.toString());

                        System.out.println(" ");
                        break;
                    case 6:
                        System.out.println(saveAcc.toString());

                        System.out.println(" ");
                        break;
                    case 7:
                        System.out.println("Current balance of Savings is $" + df.format(saveAcc.addInterest()));

                        System.out.println(" ");
                        break;

                    default: //in case user input's a number outside te range of 0-8
                        if (option > 8 || option <= 0){
                            System.out.println("Invalid Entry.");
                            System.out.println(" ");
                        }

                        break;
                }
        }
        System.out.println("Shutting off...");
    }
}