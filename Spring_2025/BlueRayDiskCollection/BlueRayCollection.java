import java.util.LinkedList;
import java.util.Iterator;

public class BlueRayCollection {
    private BlueRayDisk head;

    LinkedList<BlueRayDisk> collection = new LinkedList<BlueRayDisk>();

    public void addDisk(String title, String director, int yearOfRealease, double cost){
        BlueRayDisk newDisk = new BlueRayDisk(title, director, yearOfRealease, cost);
        collection.add(newDisk);
    }

    public String showAll(){
        String fullCollection = null;
        
        for (BlueRayDisk d : collection){
            fullCollection += d.toString() + "\n";
        }

        return fullCollection;
    }
}
