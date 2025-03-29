package DiffChecker;

import java.util.Scanner;
import java.util.*;

public class Driver {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        //title
        System.out.println("[Diff Detector]");

        //prompt user for file names
        System.out.print("Enter the name of file 1");
        scan.nextLine();
        String file1 = scan.nextLine();

        System.out.print("Enter the name of file 1");
        String file2 = scan.nextLine();

        //end of program message
        System.out.println(" ");
        System.out.println("Program Complete");
    }

    static String diff(String file1, String file2){
        //
    }
}
