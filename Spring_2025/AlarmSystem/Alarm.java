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
        //
    }

    @Override
    public String toString(){
        return name + " is currently at " + (timer/1000) + " seconds.";
    }
}