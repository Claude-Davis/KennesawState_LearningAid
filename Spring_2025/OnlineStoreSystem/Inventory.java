import java.util.LinkedList;

public class Inventory {
    private double balance=0;
    private int itemsProcessed=0;
    private LinkedList<Item> processingQueue;

    public void addItem(Item x){
        processingQueue.add(x);
    }

    public Item retrieveItem(){
        itemsProcessed++;
        Item head = processingQueue.get(0);
        processingQueue.remove(head);
        return head;
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
