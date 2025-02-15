package Digital_Inventory_System;

class Item {
    private int id;
    private static int nextId = 0;
    private double price;
    private String name;

    //constructor w/o parameters
    public Item(){
        this.id = nextId;
        this.nextId++;
        this.name = name;
        this.price = price;
    }

    //constructor
    public Item(String name, double price){
        this.id = nextId;
        this.nextId++;
        this.name = name;
        this.price = price;
    }

    //getter (id)
    public int getId(){
        return id;
    }
    
    //getter (name)
    public String getName(){
        return name;
    }

    //getter (price)
    public double getPrice(){
        return price;
    }

    //setter (price)
    public double setPrice(double pri){
        if (pri > 0){  //checks if value is a positive number
            this.price = pri;
        } else {
            this.price = price;  //if value of p is negative (or 0) the value of price is unchanged
        }

        return price;
    }

    //setter (name)
    public String setName(String n){
        this.name = n;
        return name;
    }

    //override of toString() method
    @Override
    public String toString(){
        return "Item: " + name + " (#" + id + ")" + " | Price $" + price;
    }
}
