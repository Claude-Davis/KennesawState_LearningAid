package BlueRayDiskCollection;

import java.util.Scanner;

public class DiskDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        BlueRayCollection collection = new BlueRayCollection();
        int opt=0;

        while (opt!=3) {
            //menu
            System.out.println("1. Add to collection \n 2. See Collection \n 3. Quit");
            opt = scan.nextInt();

            switch (opt) {
                default : 
                    System.out.println ("Invalid entry. Try again.");
                    break;

                case 1: 
                    System.out.print("Enter disk title: ");
                        String t = scan.nextLine();
                    System.out.print("Enter director name: ");
                        String d = scan.nextLine();
                    System.out.print("Enter year of release: ");
                        int y = scan.nextInt();
                    System.out.print("Enter price of disk: $");
                        double c = scan.nextDouble();

                    collection.addDisk(t, d, y, c);
                    break;
                
                case 2:
                    break;

                case 3:
                    break;
            }
        }
    }
    
}
