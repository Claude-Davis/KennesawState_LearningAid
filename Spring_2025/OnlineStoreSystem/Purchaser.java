public class Purchaser extends Thread {
    private static int nextId=1;
    private int id;
    private int itemsProcessed;
    private int itemsToProcess;
    private Inventory queue;
    private Item item;

    public Purchaser(Inventory queue, Item item, int itemsToProcess){
        this.id = nextId;
        this.queue = queue;
        this.item = item;
            nextId++;
        this.itemsProcessed = 0;
        this.itemsToProcess = itemsToProcess;
    }

    @Override
    public void run(){
        System.out.println("Purchaser " + id + " starting purchases...");
            for (int i=0; i<itemsToProcess; i++){
                queue.addItem(item);
                itemsProcessed++;
            }
        System.out.println("Purchaser " + id + " purchased " + itemsProcessed + " " + item.getDescription());
    }
}
