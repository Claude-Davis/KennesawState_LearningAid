import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        Inventory inventory = new Inventory();

        //objects of Item
                String desc = "T-shirt";
                double cost = 6.50;
            Item tShirt = new Item(desc, cost);
                desc = "Sweater";
                cost = 8.50;
            Item sweater = new Item(desc, cost);
                desc = "Sweatpants";
                cost = 10.00;
            Item sweatpants = new Item(desc, cost);
                desc = "Skirt";
                cost = 25.50;
            Item skirt = new Item(desc, cost);
                desc = "Dress";
                cost = 15.50;
            Item dress = new Item(desc, cost);

        //title
        System.out.println("[Order Queue Simulator]");

        //Purchaser objects
            System.out.print("Purchase how many 't-shirt' at $6.50? ");
                int quantity = scan.nextInt();
                Purchaser p1 = new Purchaser(inventory, tShirt, quantity);
            System.out.print("Purchase how many 'sweater' at $8.50? ");
                quantity = scan.nextInt();
                Purchaser p2 = new Purchaser(inventory, tShirt, quantity);
            System.out.print("Purchase how many 'sweatpants' at $10.00? ");
                quantity = scan.nextInt();
                Purchaser p3 = new Purchaser(inventory, tShirt, quantity);
            System.out.print("Purchase how many 'skirt' at $25.50? ");
                quantity = scan.nextInt();
                Purchaser p4 = new Purchaser(inventory, tShirt, quantity);
            System.out.print("Purchase how many 'dress' at $15.50? ");
                quantity = scan.nextInt();
                Purchaser p5 = new Purchaser(inventory, tShirt, quantity);
            System.out.println("Purchaser created. Press 'enter' to start purchases ...");

        scan.nextLine();

        //start threads of all purchaser objects
            System.out.println("Purchasers have started working...");
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
            System.out.println("Purchasers are done working. A total of " + pending + " items are awaiting processing.");

        
        //Processors
        System.out.print("Create how many processors? ");
            int quantityOfProcessors = scan.nextInt();
    }

}
