/* (Average an array) Write two overloaded methods that return the average of an array with the following headers:
  public static double average (double [] array )
  public static int average (int [] array)
  Write a test program that prompts the user to enter 10 double values, invokes this method, then displays the
  average value.
 */
import java.util.Scanner;

public class Opgave8 {
    public static double average (double [] array ) {
        double sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            sum += array[i];
        }return sum / array.length;
    }
    public static int average (int [] array){
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            sum += array[i];
        }return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 double numbers:");
        double inputNumbers[] = new double[10];

        for (int i = 0; i < inputNumbers.length ; i++) {
            inputNumbers[i] = input.nextDouble();
        }
        System.out.println("The average is " + average(inputNumbers));
    }
}
