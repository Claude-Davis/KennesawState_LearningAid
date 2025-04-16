
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {
    public static void main(String[] args){
        //
    }


    public static String diff(File x, File y) throws FileNotFoundException{
        Scanner readX = null;
        Scanner readY = null;

        StringBuilder difference1 = new StringBuilder();
        StringBuilder difference2 = new StringBuilder();

        String output;

        try {
            readX = new Scanner(x);
            readY = new Scanner (y);

            int lineTracker = 1;

            while (readX.hasNextLine() || readY.hasNextLine()) {
                String lineX = readX.hasNextLine() ? readX.nextLine() : "";
                    /* returns true or false:
                        "true" of the file has another line
                        "false" results in an empty String being created and given to the Scanner object (readX)
                    */
                String lineY = readY.hasNextLine() ? readY.nextLine() : "";


                if (!readX.equals(readY)){
                    difference1.append("Line "+ lineTracker + ": \n");
                    difference1.append("< " + lineX + "\n");
                    difference1.append("> " + lineY + "\n");
                } else if ( (readX.hasNextLine() && !readY.hasNextLine()) || (readY.hasNextLine() && !readX.hasNextLine()) ) {
                    difference1.append("Line "+ lineTracker + ": \n");
                    difference1.append("< " + lineX + "\n");
                    difference1.append("> " + lineY + "\n");
                } else {
                    output = difference1.toString();
                }
                
                
            }

            

        } catch (FileNotFoundException e) {
            System.out.println(e + "(The system cannot find the file specified.)");
        }
        
        return output;
        }
    }
}
