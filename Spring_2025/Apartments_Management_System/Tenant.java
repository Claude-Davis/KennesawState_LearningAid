
package Apartments_Management_System;

class Tenant {
    //attributes
    public String name;
    public double rent;
    public int age;

    public Tenant(String name, int age, double rent){ //[overloaded] constructor
        this.name = name;
        this.age = age;
        this.rent = rent;
    }

    //method
    public String toString(){
        return this.name + " (" + this.age + ") " + "| $" + this.rent + "/mo";
    }
}
