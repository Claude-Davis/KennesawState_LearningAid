package Digital_Inventory_System;
//subclass of Software

class VideoGame extends Software{
    private boolean multiplayerSupport;

    //constructor
    public VideoGame(String name, double price, String publisher, boolean multiplayerSupport){
        super(name, price, publisher);
        this.multiplayerSupport = multiplayerSupport;
    }

    //getter (multiplayerSupport)
    public boolean getSupport(){
        return multiplayerSupport;
    }

    //setter (multiplayerSupport)
    public boolean setSupport(boolean support){
        this.multiplayerSupport = support;
    }

    @Override
    public String toString(){
        return "Item: " + getName() + " (#" + getId() + ")" + " | Price $" + getPrice() + "\t   Publisher: " + getPublisher() + "\t      Multiplayer Support: " + getSupport; //The "\t" allows the remaining content to be printed on a new line
    }
}