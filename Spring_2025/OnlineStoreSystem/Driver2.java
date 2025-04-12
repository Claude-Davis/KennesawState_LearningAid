import java.util.Scanner;
import java.util.ArrayList;

public class Driver2 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        Inventory inventory = new Inventory();
        ArrayList<Processor> allProcessors = new ArrayList<Processor>(); 

        //objects of Item
            Item tShirt = new Item("T-shirt", 6.5);
            Item sweater = new Item("Sweater", 8.5);
            Item sweatpants = new Item("Sweatpants", 10.0);
            Item skirt = new Item("Skirt", 25.5);
            Item dress = new Item("Dress", 15.5);

        //title
        System.out.println("[Order Queue Simulator]");

        //Purchaser objects
            System.out.print("Purchase how many 't-shirt' at $6.50? ");
                int purchaserQuantity = scan.nextInt();
                    int itemsToProcess = purchaserQuantity;
                Purchaser p1 = new Purchaser(inventory, tShirt, purchaserQuantity);
            System.out.print("Purchase how many 'sweater' at $8.50? ");
                purchaserQuantity = scan.nextInt();
                    itemsToProcess += purchaserQuantity;
                Purchaser p2 = new Purchaser(inventory, sweater, purchaserQuantity);
            System.out.print("Purchase how many 'sweatpants' at $10.00? ");
                purchaserQuantity = scan.nextInt();
                    itemsToProcess += purchaserQuantity;
                Purchaser p3 = new Purchaser(inventory, sweatpants, purchaserQuantity);
            System.out.print("Purchase how many 'skirt' at $25.50? ");
                purchaserQuantity = scan.nextInt();
                    itemsToProcess += purchaserQuantity;
                Purchaser p4 = new Purchaser(inventory, skirt, purchaserQuantity);
            System.out.print("Purchase how many 'dress' at $15.50? ");
                purchaserQuantity = scan.nextInt();
                    itemsToProcess += purchaserQuantity;
                Purchaser p5 = new Purchaser(inventory, dress, purchaserQuantity);


            System.out.println("Purchasers created. Press 'enter' to start purchases ...");
            System.out.println(" ");

        //scan.nextLine();
        String enter = scan.nextLine();

        //start threads of all purchaser objects
            System.out.println("Purchasers have started working...");
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

        //wait for Purchaser threads to stop
            try {
                p1.join();
                p2.join();
                p3.join();
                p4.join();
                p5.join();

                System.out.println("Purchasers are done working. A total of " + itemsToProcess + " items are awaiting processing.");
            } catch (InterruptedException e){
                System.out.println("Purchaser thread interrupted: " + e.getMessage());
            }

            
            System.out.println(" ");

        
        //Processors
        System.out.print("Create how many processors? ");
            int purchaserQuantityOfProcessors = scan.nextInt();

            //create Processor objects
            for (int p=0; p<purchaserQuantityOfProcessors; p++){
                Processor newProcessor = new Processor(inventory);
                allProcessors.add(newProcessor);
            }

            System.out.println("OrderProcessors created. Press 'enter' to start processing orders...");

            scan.nextLine();
            enter = scan.nextLine();

            System.out.println("Processors are now working...");

            //start Processor objects' threads
            for (Processor p : allProcessors){
                p.start();
            }

            // Wait for Processor threads stop/finish
            for (Processor processor : allProcessors) {
                try {
                    processor.join();
                } catch (InterruptedException e) {
                    System.out.println("Processor thread interrupted: " + e.getMessage());
                }
            }
        
            System.out.println("All OrderProcessors are done processing orders.");
            System.out.println(" ");

        
        //print inventory's balance and itemsProcessed
        System.out.println(inventory.getItemsProcessed() + " items were processed for a total of $" + inventory.retrieveBalance());


        System.out.println("Simulation complete.");
    }

}
