package Gas_Station;


//abstract class
abstract class Car{
    private int id;
    private static int nextId = 0;

    public Car(){
        this.id = nextId;
        this.nextId++;
    }

    //getter (id)
    public int getId()   {return id;}
}