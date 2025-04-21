package BlueRayDiskCollection;

import java.util.LinkedList;

public class BlueRayCollection {
    private BlueRayDisk head;

    public BlueRayCollection(){
        this.head = null;
    }

    public void addDisk(String title, String director, int yearOfRelease, double cost){
        BlueRayDisk disk = new BlueRayDisk(title, director, yearOfRelease, cost);
        LinkedList<BlueRayDisk> list = new LinkedList<BlueRayDisk>();

        if (head.equals(null)) {
            head = disk;
        }
        list.add(disk);
    }

    public String toString(){
        return ;
    }
}
