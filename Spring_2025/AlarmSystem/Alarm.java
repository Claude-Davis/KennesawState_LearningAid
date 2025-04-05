package AlarmSystem;

class Alarm extends Thread{
    private int timer; //note: stored in milliseconds
    private String name;
    private int id;
    private static int nextId = 1;

    public Alarm(String name, int timer){
        this.name = name;
        this.timer = timer;
        this.id = nextId;
        nextId++;
    }

    public int getTimer(){
        return timer * 1000;
    }

    public String getName(){
        if (name.equals("")){ return "Alarm X";}
        else { return name; }
    }

    @Override
    public void run(){
        try {
            Thread.sleep(1000);
            timer -= 1000;
            if (timer == (10000)) { System.out.println( name + " will go off in 10 seconds."); }
            if (timer == 0) { System.out.println(name + " has gone off."); }
        } catch (InterruptedException e) {
            System.out.println(name + " has been interrupted at " + (timer/1000) + " seconds.");
        }
    }

    @Override
    public String toString(){
        return name + " is currently at " + (timer/1000) + " seconds.";
    }
}