package Exercise.begineer;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = getNumber(in, "first");
        int number2 = getNumber(in, "second");
        System.out.println("Addition: " + add(number1, number2));
        System.out.println("Subtraction: " + subtract(number1, number2));
        System.out.println("Multiplication: " + multiply(number1, number2));
        System.out.println("Division: " + divide(number1, number2));
    }

    public static int getNumber(Scanner in, String order) {
        System.out.print("Input " + order + " number: ");
        return in.nextInt();
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}