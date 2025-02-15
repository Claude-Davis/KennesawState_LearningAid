package Digital_Inventory_System;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args){
        //imports
        Scanner scan = new Scanner (System.in);
        ArrayList<Item> items = new ArrayList<>();  //creates an arraylist of Item (class)
        DecimalFormat df = new DecimalFormat("0.00");

        //initiate "choice"
        int choice = 0;

        //main loop
        while (choice != 7){
            //menu
            System.out.println("1. Add Video Game");
            System.out.println("2. Add Development Kit");
            System.out.println("3. Add Tradable");
            System.out.println("4. Add Collectable");
            System.out.println("5. List All Items");
            System.out.println("6. Update Price");
            System.out.println("7. Quit Program");
            choice = scan.nextInt();

            switch (choice){
                default:
                    System.out.println("Invalid Entry.");

                    System.out.println(" ");
                    break;
                case 1: //VideoGame , creating a VideoGame object
                    //prompt user for necessary info
                    String name = scan.nextLine();
                    double price = scan.nextDouble();
                    String publisher = scan.nextLine();
                    boolean multiplayerSupport = scan.nextBoolean();

                    //create object (VideoGame)
                    VideoGame newGame = new VideoGame(name, price, publisher, multiplayerSupport);
                    //add the object the arraylist "items"
                    items.add(newGame);

                    System.out.println(" ");
                    break;
            }
        }
        System.out.println("Goodbye!");
        System.out.print("  Shutting off...");
    }
}
