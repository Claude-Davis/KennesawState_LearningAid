public class Purchaser extends Thread {
    private static int nextId=1;
    private int id;
    private int itemsProcessed;
    private int itemsToProcess;
    private Inventory queue;
    private Item item;

    public Purchaser(Inventory queue, Item item, int nextId){
        this.id = nextId;
        this.queue = queue;
        this.item = item;
            nextId++;
    }

    @Override
    public void run(){
        //
    }
}
