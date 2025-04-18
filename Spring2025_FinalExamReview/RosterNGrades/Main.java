import java.io.*;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Main {
    public static void main (String[] args) throws FileNotFoundException, NoSuchElementException{
        System.out.println(studentGrades());
    }

    public static String studentGrades() throws FileNotFoundException, NoSuchElementException{
        File students = new File("StudentRoster.txt");
        File grades = new File("Grades.txt");

        Scanner readStudents = new Scanner(students);
        Scanner readGrades = new Scanner(grades);
        
        String studentsName;
        String grade;

        StringBuilder lines = null;

        try{
            while (readStudents.hasNextLine()) {
                studentsName = readStudents.nextLine();
                grade = readGrades.nextLine();

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
