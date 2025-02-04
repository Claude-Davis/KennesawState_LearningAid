import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ParkWallet newWallet = new ParkWallet(); // creates an instance of the class ParkWallet called "newWallet"

        System.out.println("[Theme Park Wallet Manager]");
        System.out.println("1. Add tickets");
        System.out.println("2. Set tickets");
        System.out.println("3. Buy prize");
        System.out.println("4. Set holiday");
        System.out.println("5. Quit");

        System.out.println("Your wallet has " + newWallet.getTickets() + " tickets.");

        System.out.print("Enter option: ");
        int option = scan.nextInt();

        System.out.println(" "); //blank space for break

        while(option != 5) {
            switch(option){
                case 1:
                    System.out.print("Add how many tickets? ");
                    int additional = scan.nextInt();

                    newWallet.addTickets(additional);

                    System.out.println(" "); //blank space for break

                    break;
                case 2:
                    System.out.print("Set ticket balance to: ");
                    int balance = scan.nextInt();

                    //newWallet.getTickets() = balance;

                    System.out.println(" "); //blank space for break

                    break;
                case 3:
                    System.out.print("1. T-shirt (150 tickets)");
                    System.out.print("2. Sun Hat (350 tickets)");
                    System.out.print("3. Sneakers (600 tickets)");
                    System.out.print("Buy which prize? ");
                    int prizeChoice = scan.nextInt();

                    switch (prizeChoice){
                        case 1:
                            if (newWallet.getTickets() >= 150){
                                //subtract value from user wallet
                            }
                            else if (newWallet.getTickets() < 150) {
                                System.out.println("Not enough tickets.");
                            }
                        case 2:
                            if (newWallet.getTickets() >= 350){
                                //
                            }
                            else if (newWallet.getTickets() < 350) {
                                System.out.println("Not enough tickets.");
                            }
                        case 3:
                            if (newWallet.getTickets() >= 600){
                                //
                            }
                            else if (newWallet.getTickets() < 600) {
                                System.out.println("Not enough tickets.");
                            }
                    }

                    System.out.println(" "); //blank space for break

                    break;
                /*case 4:
                    if (!newWallet.getHoliday()){
                        newWallet.getHoliday(true);
                        System.out.print("It is now a holiday.");
                    }
                    else if (newWallet.getHoliday()){
                        newWallet.getHoliday(false);
                        System.out.print("It is no longer a holiday.");
                    }

                    System.out.println(" "); //blank space for break

                    break; */
            }
        }
        System.out.println("Shutting off...");
    }
}
