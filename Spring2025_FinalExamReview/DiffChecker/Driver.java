import java.io.*;
import java.util.Scanner;

public class Driver {
    public static String diff(File file1, File file2) throws FileNotFoundException{
        try {
            Scanner forTest1 = new Scanner(file1);
            Scanner forTest2 = new Scanner(file2);

            String line1 = "";
            String line2 = "";

            int lineNum = 0;

            while ((forTest1.hasNextLine()) || (forTest2.hasNextLine())) {
                line1 = forTest1.nextLine();
                line2 = forTest2.nextLine();

                lineNum++;

                //line differences
                if (!line1.equals(line2)){
                    System.out.println("Line " + lineNum +": \n< " + line1 + "\n> " + line2);
                }

                //number of line differences
                if ((forTest1.hasNextLine() && !forTest2.hasNextLine()) || (forTest2.hasNextLine() && !forTest1.hasNextLine())) {
                    System.out.println("Files have different number of lines.");
                }
            }

            //line identical
            if (line1 == line2) {
                System.out.println("Files are identical.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("[Diff Detector]");
        int opt = 0;

        while (opt!=8){
            //menu
            switch (opt){
                //
            }
        }
    }
}
