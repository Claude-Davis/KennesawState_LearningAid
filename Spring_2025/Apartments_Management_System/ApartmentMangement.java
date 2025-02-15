//prompt: https://www.kennesaw.edu/ccse/first-year-experience/cse1322l/assignments/cse-1322l-spring-2025-assignment-2-v1.1.pdf

package Apartments_Management_System;

import java.util.Scanner;
import java.util.ArrayList;

public class ApartmentMangement {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Building> buildings = new ArrayList<>();

        System.out.println("[Apartment Complex Management System");
        int option = 1;

        while (option != 0){
            //options/menu
            System.out.println("1. Add building");
            System.out.println("2. Remove building");
            System.out.println("3. List all buildings");
            System.out.println("4. List all tenants");
            System.out.println("5. Add tenant");
            System.out.println("6. Remove tenant");
            System.out.println("7. Update tenant");
            System.out.println("8. Charge rent");
            System.out.println("9. Pay for service");
            System.out.println("0. Quit");
            option = scan.nextInt();

            System.out.println(" ");

            switch (option) {
                case 1:
                    System.out.print("How many tenants can this building have? ");
                    int size = scan.nextInt();

                    //create a new object of the class Building
                    Building bldg = new Building(size);
                    System.out.println("Building " + bldg.getId() + " created.");

                    //add the object to the "buildings" ArrayList
                    buildings.add(bldg);

                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Enter id of building to remove: ");
                    int removeBuilding = scan.nextInt();

                    //search "buildings" arrayList for the bldg of that specific id #
                    for (int i = 0; i <= buildings.size(); i++){  //searches through the "buildings" arraylist
                        if (buildings.get(i).getId() == removeBuilding){ //matches user input to the id # of a specific object
                            buildings.remove(removeBuilding); //removes the matching object from  the arraylist
                        } else { //if there is no matching object, print the statement below
                            System.out.println("Building " + removeBuilding + " does not exist.");
                        }
                    }
                    System.out.println("Building removed.");

                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.print("Enter id of building: ");
                    int id_5 = scan.nextInt();

                    //list all tenants in the building
                    for (int i = 0; i <= buildings.size(); i++){  //searches through the "buildings" arraylist
                        if (buildings.get(i).getId() == id){ //matches user input to the id # of a specific object
                            //print all buildings
                        } else { //if there is no matching object, print the statement below
                            System.out.println("Error: no building matches this id.");
                        }

                    //inputs to create tenant
                    System.out.print("Enter tenant name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter tenant age: ");
                    int age = scan.nextInt();
                    System.out.print("Enter tenant rent: ");
                    double rent = scan.nextDouble();
                    //create Tenant object
                    Tenant tenant = new Tenant(name, age, rent);

                    //assign tenant to a bldg
                    System.out.print("Add tenant to which apartment? ");

                    System.out.println("Tenant added.");

                    System.out.println(" ");
                    break;
                case 6:
                    System.out.print("Enter id of building: ");
                    int if_6 = scan.nextInt();

                    // list tenants

                    System.out.print("Remove tenant at which apartment? ");
                    int removeT = scan.nextInt();

                    // if-else code

                    System.out.println("Tenant removed.");

                    System.out.println(" ");
                    break;
                case 7:
                    System.out.print("Enter id of building: ");
                    int id_7 = scan.nextInt();

                    //list tenants of buildings

                    System.out.print("Update tenant at which apartment? ");
                    int apartment_id = scan.nextInt();

                    //check validity / match apartment

                    System.out.println(" ");
                    break;
                case 8:
                    System.out.print("Enter id of building: ");
                    int id_8 = scan.nextInt();

                    //list tenants

                    System.out.println(" ");

                    System.out.print("Charge rent of which tenant? ");
                    int tenant_id = scan.nextInt();

                    System.out.println("Tenant charged. New balance is " + bldg.getBalance());

                    System.out.println(" ");
                    break;
                case 9:
                    System.out.println(" ");
                    break;
            }
            System.out.println(" ");
            System.out.println("Shutting off...");
        }
    }
}
