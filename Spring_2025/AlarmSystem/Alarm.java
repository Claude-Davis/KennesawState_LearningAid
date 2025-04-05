package AlarmSystem;

class Alarm extends Thread{
    private int timer; //note: will be stored in milliseconds
    private String name;
    private int id;
    private static int nextId = 1;

    public Alarm(String name, int seconds){
        this.id = nextId;
        nextId++;

        if (name.isEmpty()){ this.name = "Alarm " + id;
        } else { this.name = name; }
        this.timer = seconds * 1000;  //conversion of seconds to milliseconds
    }

    @Override
    public void run(){
        try {
            while (timer > 0){
                Thread.sleep(1000);
                timer -= 1000;
                if (timer == (10000)) { System.out.println( name + " will go off in 10 seconds."); }
            }
            System.out.println(name + " has gone off.");
            
        } catch (InterruptedException e) {
            System.out.println(name + " has been interrupted at " + (timer/1000) + " seconds.");
        }
    }

    @Override
    public String toString(){
        return name + " is currently at " + (timer/1000) + " seconds.";
    }
}