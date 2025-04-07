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
        
        Iterator it = collection.iterator();

        while(it.hasNext()){
            fullCollection += it + "\n";
        }
        return fullCollection;
    }
}
