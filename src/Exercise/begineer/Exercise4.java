// Write a Java program that takes two numbers as input and displays the product of two numbers.

package Exercise.begineer;
import java.util.Scanner;


public class Exercise4 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        // Prompt the user to input the first number
        System.out.print("Input first number: ");
        // Read and store the first number
        int number1 = in.nextInt();

        // Prompt the user to input the second number
        System.out.print("Input second number: ");
        // Read and store the first number
        int number2 = in.nextInt();

        System.out.println(number1 * number2);

    }
}
