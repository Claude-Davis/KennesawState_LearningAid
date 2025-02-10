//prompt: https://www.kennesaw.edu/ccse/first-year-experience/cse1322l/assignments/cse-1322l-spring-2025-assignment-2-v1.1.pdf

import java.util.Arrays;

class Building {
    private Tenant[] apartments; //array of tenants
    private static double balance = 0;
    private static int nextId = 1;
    private int id;

    public Building(int size){
        this.apartments = new Tenant[size]; //initializes an "apartments" array
        this.id = nextId;
        this.nextId++; //nextId is increased by 1
    }

    //getter function (id)  //(allow for the private attribute, id, to be accessed outside the file)
    public int getId(){
        return id;
    }
    //getter function (balance)  //(allow for the private attribute, balance, to be accessed outside the file)
    public static double getBalance(){ //because "balance" is static, its getter function must also be static
        return balance;
    }
    //getter function (get tenants)
    public Tenant getTenant(int index){
        if (index < 0 || index > apartments.length){  //if the provided index is negative or
            return null;
        } else{
            return apartments[index];
        }
    }

//

    //behavior (counting tenants)
    public int countTenants(){
        return apartments.length;
    }

    //behavior (adding tenants)
    public boolean addTenants(Tenant tenant, int index){
        if (index < 0 || index >= apartments.length || apartments[index] != null){
            return false;
        } else {
            apartments[index]= tenant;
            return true;
        }
    }

    //behavior (removing tenants)

    //behavior (list all tenants in a building)
    public String listTenants(){
        return "Apartment " + this.id + ": " + Tenant.toString();
    }

    //behavior (collecting rent)
    public static void collectRent(Tenant){
        balance += Tenant.rent;
    }

    //behavior
    public static void payForService(){
        //
    }
}
