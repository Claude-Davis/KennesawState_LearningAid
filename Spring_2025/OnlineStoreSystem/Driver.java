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

        //objects of Purchaser
        Purchaser p1 = new Purchaser();

        //title
        System.out.println("");

        //option initialized
        int option=0;
    }

}
