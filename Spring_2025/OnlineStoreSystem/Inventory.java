import java.util.ArrayList;

public class Inventory {
    private double balance=0;
    private int itemsProcessed=0;
    private ArrayList<Item> processingQueue;

    public void addItem(Item x){
        //
    }

    public Item retrieveItem(){
        itemsProcessed++;
        return ;
    }

    public void incrementBalance(double x){
        balance += x;
    }

    public double retrieveBalance(){
        return balance;
    }

    public int getQueueSize(){
        return processingQueue.size();
    }

    public int getItemsProcessed(){
        return itemsProcessed;
    }
}
