package BlueRayDiskCollection;

import java.util.LinkedList;

public class BlueRayCollection {
    private BlueRayDisk head;
    private LinkedList<BlueRayDisk> list;

    public BlueRayCollection(){
        this.head = null;
    }

    public void addDisk(String title, String director, int yearOfRelease, double cost){
        BlueRayDisk disk = new BlueRayDisk(title, director, yearOfRelease, cost);
        list = new LinkedList<BlueRayDisk>();

        if (head.equals(null)) {
            head = disk;
        }

        list.add(disk);

        System.out.println("BlueRay Disk added to Collection.");
    }

    public String showAll(){
        StringBuilder print = new StringBuilder();
        for (BlueRayDisk d : list) {
            while (!d.equals(null)){
                print.append(d + "\n");
            }
        }

        return print.toString();
    }
}
