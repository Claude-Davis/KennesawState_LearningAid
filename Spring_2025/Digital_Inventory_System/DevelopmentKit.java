package Digital_Inventory_System;
//subclass of Software

import java.util.ArrayList;

class DevelopmentKit extends Software{
    private ArrayList<String> targetPlatforms;
    
    //constructor
    public DevelopmentKit(String name, double price, String publisher, ArrayList<String> targetPlatforms){
        super(name, price, publisher);
        this.targetPlatforms = targetPlatforms;
    }

    //getter (targetPlatforms)
    public ArrayList<String> getPlatforms(){
        return targetPlatforms;
    }

    //setter (targetPlatforms)
    public ArrayList<String> setPlatforms(ArrayList<String> taP){
        if (taP.isEmpty()){ //checks if arraylist is empty using a specific method
            taP.add("None");
            targetPlatforms = taP;
        } else{
            targetPlatforms = taP;
        }

        return targetPlatforms;
    }

    @Override
    public String toString(){
        //The "\t" allows the remaining content to be printed on a new line
        return "Item: " + getName() + " (#" + getId() + ")" + " | Price $" + getPrice() + "\t   Publisher: " + getPublisher() + "\t   Target Platforms: " + targetPlatforms + ".";
    }
}
