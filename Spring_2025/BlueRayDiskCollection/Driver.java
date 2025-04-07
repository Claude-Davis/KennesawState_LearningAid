import java.util.Scanner;
import java.util.ArrayList;

public class Driver {
    Scanner scan = new Scanner(System.in);
    BlueRayCollection collection = new BlueRayCollection();

    //title
    System.out.println("[BlueRay Disk Collection]");
    
    int option = 0;

    while (option!=3) {
        //menu
        System.out.println("1. Add to collection");
        System.out.println("2. See Collection");
        System.out.println("3. Quit program");
        
        System.out.print("Enter option: ");
        option = scan.nextInt();

        System.out.println(" ");

        switch(option){
            case 1:
                System.out.print("Enter disk title: ");
                    String title = scan.nextLine();
                System.out.print("Enter director name: ");
                    String director = scan.nextLine();
                System.out.print("Enter year of release: ");
                    int yearOfRelease = scan.nextInt();
                System.out.print("Enter price: ");
                    double cost = scan.nextDouble();

                BlueRayDisk newDisk = new BlueRayDisk(title, director, yearOfRelease, cost);
                //

                System.out.print("BlueRay Disk added to collection.");

                System.out.println(" ");
                break; 
            case 2:
                System.out.println("Here's your current collection:");
                break;
            default:
                if (option!=3) {System.out.println("Invalid entry"); }
                break;
        }
    }
    System.out.println("Shutting off...");
}
