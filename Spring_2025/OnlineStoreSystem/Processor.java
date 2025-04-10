public class Processor extends Thread{
    private static int nextId=1;
    private int id;
    private Inventory queue;
    private int numberOfOrders;
    private double revenue;

    public Processor(Inventory queue){
        this.numberOfOrders = 0;
        this.revenue = 0;
        this.id = nextId;
            nextId++;
        this.queue = queue;
    }

    @Override
    public void run(){
        if (queue == null){
            break;
        } else{
            //
        }
        queue.incrementBalance(item.getCost);
    }
}
