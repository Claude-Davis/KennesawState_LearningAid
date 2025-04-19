import java.io.*;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Main {
    public static void main (String[] args) throws FileNotFoundException, NoSuchElementException{
        System.out.println(studentGrades());

        System.out.println("Average of Grades: " );
    }

    public static String studentGrades() throws FileNotFoundException, NoSuchElementException{
        
        
        String studentsName = "";
        String grade = "";

        StringBuilder lines = new StringBuilder();

        int sumOfGrades = 0;

        try{
            File students = new File("StudentRoster.txt");
            File grades = new File("Grades.txt");

            Scanner readStudents = new Scanner(students);
            Scanner readGrades = new Scanner(grades);

            while (readStudents.hasNextLine()) {
                studentsName = readStudents.nextLine();
                grade = readGrades.nextLine();

                sumOfGrades += Integer.parseInt(grade);

                lines.append("\n" + studentsName +": " + grade);
            }
            return lines.toString();
        } catch (FileNotFoundException e){
            System.out.println("ERROR: " + e.getMessage());
        } catch (NoSuchElementException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        return lines.toString();
    }
}
