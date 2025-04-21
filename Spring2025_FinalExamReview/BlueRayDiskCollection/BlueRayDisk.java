package BlueRayDiskCollection;

public class BlueRayDisk {
    private String title;
    private String director;
    private int yearOfRelease;
    private double cost;
    public BlueRayDisk next;

    public BlueRayDisk(String title, String director, int yearOfRelease, double cost){
        this.title=title;
        this.director=director;
        this.yearOfRelease=yearOfRelease;
        this.cost=cost;
        this.next=null;
    }

    public String toString(){
        return title + " - " + director + " (" + yearOfRelease + ") : $" + cost;
    }
}
