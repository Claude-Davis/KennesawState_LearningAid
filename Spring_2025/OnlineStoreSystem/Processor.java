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
        int count = 0;
        while (count < queue.getQueueSize()){
            if (queue==null){
                break;
            } else {
                Item item = queue.retrieveItem();
                queue.incrementBalance(item.getCost());
                numberOfOrders++;
                revenue += item.getCost();
            }
        }
        System.out.println("OrderProcessor " + id + " processed a total of " + numberOfOrders + " orders for a total of $" + revenue + ".");
    }
}
