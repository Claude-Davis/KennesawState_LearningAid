import java.io.*;
import java.util.Scanner;

public class DiffDriver {
    public static String diff(File file1, File file2) throws FileNotFoundException{
        String line1 = "";
        String line2 = "";

        int lineNum = 0;

        String printThis = " ";

        try {
            Scanner forTest1 = new Scanner(file1);
            Scanner forTest2 = new Scanner(file2);

            while ((forTest1.hasNextLine()) || (forTest2.hasNextLine())) {
                line1 = forTest1.nextLine();
                line2 = forTest2.nextLine();

                lineNum++;

                //line differences
                if (!line1.equals(line2)){
                    printThis = "Line " + lineNum +": \n< " + line1 + "\n> " + line2;
                }

                //number of line differences
                if ((forTest1.hasNextLine() && !forTest2.hasNextLine()) || (forTest2.hasNextLine() && !forTest1.hasNextLine())) {
                    printThis = "Files have different number of lines.";
                }
            }

            //line identical
            if (line1 == line2) {
                printThis = "Files are identical.";
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //printThis = printThis;
        return printThis;
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(System.in);
        System.out.println("[Diff Detector]");
        int opt = 0;

            System.out.print("Enter the name of file 1: ");
                String fileName1 = scan.nextLine();
            System.out.print("Enter the name of file 2: ");
                String fileName2 = scan.nextLine();

            File file1 = new File(fileName1);
            File file2 = new File(fileName2);

            System.out.println(diff(file1, file2));
    }
}
