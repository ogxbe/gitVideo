/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gpacalculator;
import java.util.Scanner;
import java.util.InputMismatchException;
public class GPACalculator {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char letterGrade;    // User defined letter grade 
        int creditHours;     // User defined number of credit hours
        char quitCmd;        // Indicates quit/continue

        quitCmd = 'a';

        int qualityPoints = 0;
        int totalCreditHrs = 0;

        while (quitCmd != 'q') {
        try{
            // Get user data
            System.out.print("Enter letter grade: ");
            letterGrade = scnr.nextLine().charAt(0);
            //Error checking,unknown letter grade
            if (getLetterGradeValue(letterGrade) == -1){
                //If incorrect grade is entered, jump to catch statement
                throw new Exception("Invalid letter grade. Try again");
            }
            System.out.print("Enter number of credit hours: ");
            creditHours = scnr.nextInt();
            //Error checking, negative credit hours
            if (creditHours < 0){
                   //If incorrect grade is entered, jump to catch statement
                throw new Exception("Invalid number of credit hours. " + "Try again!");
            } 
                totalCreditHrs += creditHours;
            qualityPoints += getLetterGradeValue(letterGrade) * creditHours;
} //END OF TRY
//Catches error after its found
        catch(InputMismatchException error){
            scnr.nextLine();
            System.out.println("Invalid type entered. Please try again");
        }
      
        
        System.out.print("\nEnter any key to continue entering grade or 'q' to quit: ");
            quitCmd = scnr.next().charAt(0);
            scnr.nextLine();
        } //END OF WHILE
        
        // cacluate GPA - Divide the total quality points by the total credit hours.
        double gpa = computeIntGPA(qualityPoints, totalCreditHrs);

        //Print user GPA info
        System.out.println("GPA: " + gpa);

    } //END OF MAIN

    private static int getLetterGradeValue(char letterGrade) {
        if (letterGrade == 'a' || letterGrade == 'A') {
            return 4;
        }
        if (letterGrade == 'b' || letterGrade == 'B') {
            return 3;
        }
        if (letterGrade == 'c' || letterGrade == 'C') {
            return 2;
        }
       
         else {
            return -1;
        }
    }

    private static int computeIntGPA(int qualityPoints, int ceditHours) {
        return qualityPoints / ceditHours;
    }

    private static double computeGPA(int qualityPoints, int ceditHours) {
        return ((double) qualityPoints) / ceditHours;
    }
}