package AlarmSystem;

import java.util.Scanner;
import java.util.ArrayList;

public class Driver{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        ArrayList<Alarms> allAlarms = new Arraylust<>();

        //title
        System.out.println("[AlarmSystem]");

        int option = 0;
        
        while (option!=3){
            //menu
            System.out.println("1. Create new alarm");
            System.out.println("2. View all alarms");
            System.out.println("3. Quit");

            //choice selection
            System.out.print("Enter option: ");
            option = scan.nextInt();

            System.out.println(" ");  //space separation

            switch (option){
                case 1:                                                                 //create an alarm
                    // prompt for info
                    System.out.print("Enter alarm name: ");
                        String name = scan.nextLine();
                    try{
                        System.out.print("Enter alarm timer in seconds: ");
                        int seconds = scan.nextInt();
                    } catch (InputMismatchException e){
                        System.out.println("Invalid timer: Timer must be a whole number.");
                    } finally{
                        scan.close();
                    }

                    //create object
                    Alarm x = new Alarm(name, seconds);
                    //add object to arraylist
                    allAlarms.add(x);
                    //call toString() method
                    x.toString();

                    System.out.println(" ");
                    break;

                case 2:                                                             //show all alarms
                    System.out.println("Here are all the alarms running:");
                    for (int a=0; a<allAlarms.length(); a++){
                        allAlarms.get(a).toString();
                        a++;
                    }

                    System.out.println(" ");
                    break;
                default:
                    if (option!=3){
                        System.out.println("Invalid entry.");
                    }

                    System.out.println(" ");
                    break;
            }
        }
        System.out.print("Shutting off...");
    }
}