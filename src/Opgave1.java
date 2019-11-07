/*(Assign grades) Write a program that reads student scores, get the best score, and then assigns grades based
on the following scheme:
Grade is A if score is >= best -5
Grade is B if score is >= best -10
Grade is C if score is >= best -15
Grade is D if score is >= best -20
Grade is F for otherwise
The program prompts the user to enter the total number of students, and then prompts the user to enter all of the
scores, and concludes by displaying the grades.
*/
import java.util.Scanner;

public class Opgave1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();
        int [] scores = new int [numberOfStudents];

        System.out.println("Enter 4 scores:");
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
        }
        int best = scores[0];
        for (int j = 1; j < scores.length; j++) {
            if(scores[j] > best) best = scores [j];
        }

        for (int g = 0; g < numberOfStudents; g++) {
            char grade;
            if (scores[g] >= best - 5) grade = 'A';
            else if (scores[g] >= best - 10) grade = 'B';
            else if (scores[g] >= best - 15) grade = 'C';
            else if (scores[g] >= best - 20) grade = 'D';
            else grade = 'F';
            System.out.println("Student " + g + " score is " + scores[g] + " and grade is " + grade);

        }
    }
}
