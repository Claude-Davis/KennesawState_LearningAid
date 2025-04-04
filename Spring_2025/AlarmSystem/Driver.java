package AlarmSystem;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Driver{
    public static void main(String[] args) throws InputMismatchException{
        Scanner scan = new Scanner (System.in);
        ArrayList<Alarm> allAlarms = new ArrayList<>();

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
                    scan.nextLine();
                    String name = scan.nextLine();

                        int seconds = 0; //"seconds" initialized
                    try{
                        System.out.print("Enter alarm timer in seconds: ");
                        seconds = scan.nextInt();
                    } catch (InputMismatchException e){
                        System.out.println("Invalid timer: Timer must be a whole number.");
                    } /* finally{
                        scan.close();           //NOTE: cannshould NOT use this w/in a loop
                    } */

                    //create object
                    Alarm x = new Alarm(name, seconds);

                    //start alarm
                    x.start();

                    //add object to arraylist
                    allAlarms.add(x);

                    //call toString() method
                    x.toString();

                    System.out.println(" ");
                    break;

                case 2:                                                             //show all alarms
                    System.out.println("Here are all the alarms running:");
                    for (int a=0; a<allAlarms.size(); a++){
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
        scan.close();
        System.out.print("Shutting off...");
    }
}