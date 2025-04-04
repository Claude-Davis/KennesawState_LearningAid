package AlarmSystem;

class Alarm extends Threads{
    private int timer; //note: stored in milliseconds
    private String name;
    private int id;
    private static int nextId = 1;

    public class Alarm(String name, int seconds){ 
        if (name.equals(null)){ this.name = "Alarm X";
        } else { this.name = name;}
        this.timer = seconds * 1000;
        this.id = nextId;
        nextId++;
    }

    @Override
    public int run(){
        this.timer -= 1000;
        try {
            Thread.sleep(seconds * 1000)
            if (timer == (10*1000)) { System.out.println( name + " will go off in 10 seonds."); }
            if (timer == 0) { System.out.println(name + " has gone off."); }
        } catch (InterruptedException e) {
            System.out.println(name + " has been interrupted at " + (timer * 1000) + " seconds.");
        } finally {
            Alarm.close();
        }
    }

    @Override
    public String toString(){
        return name + " is currently at " + (timer/1000) + " seconds.";
    }
}