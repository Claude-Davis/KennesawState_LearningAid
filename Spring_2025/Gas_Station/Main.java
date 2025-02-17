import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //title
        System.out.println("[The Refueler Station]");

        //initialize "option"
        int option = 0;

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

                    //

                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println(" ");

                    //

                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println(" ");

                    //

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

                    //

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
