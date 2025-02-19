package Gas_Station;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Random; //to allow for random # generation

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("0.00");
        Random ranNum = new Random(System.in);

        //title
        System.out.println("[The Refueler Station]");

        //initialize "option"
        int option = 0;

        //initialize "balance"
        double balance;  //will track the profit of the gas station

        while (option != 9){
            //menu
            System.out.println("1. Add gas car");
            System.out.println("2. Add electric car");
            System.out.println("3. Add hybrid car");
            System.out.println("4. Refuel all gas engines");
            System.out.println("5. Recharge all electric engines");
            System.out.println("6. Refuel and recharge all vehicles");
            System.out.println("7. Display all vehicles");
            System.out.println("8. Dispatch all vehicles");
            System.out.println("9. Quit program");
            option = sc.nextInt();

            //prices
            System.out.println("Gas: $4.00/gal | Electricity: $0.20/kW");

            switch(option){
                case 1:
                    System.out.println(" ");

                    //random generation of the needed values
                    double tankCapacity = ranNum(30) + 15;
                    double currentVolume = ranNum(14) + 2;

                    //create object for GasCar
                    GasCar gasCar = new GasCar(tankCapacity, currentVolume);

                    //add object to "cars" ArrayList
                    cars.add(gasCar);

                    System.out.println("Vehicle " + getId() + " has parked at a pump.");

                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println(" ");

                    //random generation of the needed values
                    double maxBattery = ranNum(100) + 40;
                    double currentCharge = ranNum(30) + 2;

                    //create object of ElectricCar
                    ElectricCar elecCar = new ElectricCar(maxBattery, currentCharge);

                    //add object to "cars"
                    cars.add(elecCar);

                    System.out.println("Vehicle " + getId() + " has parked at a pump.");

                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println(" ");

                    //random generation of the needed values
                    tankCapacity = ranNum(30) + 15;
                    currentVolume = ranNum(14) + 2;
                    maxBattery = ranNum(100) + 40;
                    currentCharge = ranNum(30) + 2;

                    //create object of HybridCar
                    HybridCar hybrid = new HybridCar(tankCapacity, currentVolume, currentCharge, maxBattery);

                    //add object to "cars"
                    cars.add(hybrid);

                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println(" ");

                    //

                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println(" ");

                    //

                    System.out.println(" ");
                    break;
                case 6:
                    System.out.println(" ");

                    //

                    System.out.println(" ");
                    break;
                case 7:
                    System.out.println(" ");

                    for (int c=0; c<=cars.size(); c++){
                        System.out.println(cars.get(c).toString());
                    }

                    System.out.println(" ");
                    break;
                case 8:
                    System.out.println(" ");

                    //

                    System.out.println(" ");
                    break;
            }
        }
        // code
        System.out.println("Shutting off...");
    }
    
}
