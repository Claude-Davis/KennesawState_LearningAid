/* RECURSION
    ...is a process where a method calls itself in order to solve a smaller version of the origin problem.abstract 

    2 Parts:
        1. Base Case - the condition that stops the recursion
        2. Recursive Case - when the functino calls itself

*/

import java.util.Scanner;

public class Quiz5_Recursions{
    public static void main(String[] args){                    //example using factorial : formula -> n! = n * (n-1) * (n-2) * ...
        Scanner scan = new Scanner (System.in);

        System.out.print("Input a number: ");

        int num1 = scan.nextInt();
        int result = factorial(num1);
        
        System.out.println("Factorial of " + num1 + " is " + result + ".");
    }

    public static int factorial(int n){
        if (n == 1) {                               //the Base Case
            return 1;
        }
        return n * factorial(n-1);                  //the Recursive Case
    }
}