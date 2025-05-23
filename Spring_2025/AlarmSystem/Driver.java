package AlarmSystem;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Driver{
    public static void main(String[] args) throws InputMismatchException, NumberFormatException{
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

                        String secondsInput; //"secondsInput" initialized
                        int seconds; //"seconds" initialized
                    try{
                        System.out.print("Enter alarm timer in seconds: ");
                        secondsInput = scan.nextLine();

                        //convert secondsInput to int
                        seconds = Integer.parseInt(secondsInput); //if this fails, the error will be caught and the line under 'catch' will be printed

                        //create object
                        Alarm x = new Alarm(name, seconds);

                        //add object to arraylist
                        allAlarms.add(x);

                        //call toString() method
                        x.toString();

                        //start alarm
                        x.start();
                    } catch (InputMismatchException e){
                        System.out.println("Invalid timer: Timer must be a whole number only.");
                    } catch (NumberFormatException e2){
                        System.out.println("Invalid timer: Timer must be a whole number only.");
                    }
                    /* finally{
                        scan.close();           //NOTE: should NOT use this w/in a loop
                    } */

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
        System.out.println("Stopping all alarms...");

        //interrupt/stop all alarms
        for (Alarm a : allAlarms){
            if (a.isAlive()){
                a.interrupt(); 
            }
        }

        //
        try { Thread.sleep(300); //allow time for each toString() to print
        } catch (InterruptedException e) {
            //does nothing
        }
        scan.close();
        System.out.println("All alarms have been stopped.");
        System.out.print("Shutting off...");
    }
}