public class Purchaser extends Thread {
    private static int nextId=1;
    private int id;
    private int itemsProcessed;
    private int itemsToProcess;
    private Inventory queue;
    private Item item;

    public Purchaser(Inventory queue, Item item, int x){
        this.id = nextId;
        this.queue = queue;
        this.item = item;
            nextId++;
        this.itemsProcessed = 0;
        this.itemsToProcess = x;
    }

    @Override
    public void run(){
        //
    }
}
