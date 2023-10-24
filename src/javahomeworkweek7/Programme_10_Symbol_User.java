package javahomeworkweek7;
/**
 * Write a java program to input any two number and ask user to enter their symbol
 * (+, -, /, *) find addition, Subtraction, multiplication and division
 * according to their symbol
 * <p>
 * (using if else)
 */

import java.util.Scanner;

public class Programme_10_Symbol_User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter any one symbol from (+, -, *, /): ");  // print statement to enter a data by user
        char symbol = scanner.next().charAt(0);
        scanner.close(); // close scanner

        // apply condition to calculate numbers as per entered symbol by user
        double result;
        if (symbol == '+') { // condition
            result = firstNumber + secondNumber;
            System.out.println("Answer: " + result); // print result according to given condition

        } else if (symbol == '-') {
            result = firstNumber - secondNumber;
            System.out.println("Answer: " + result);

        } else if (symbol == '*') {
            result = firstNumber * secondNumber;
            System.out.println("Answer: " + result);

        } else if (symbol == '/') {
            if (secondNumber != 0) { // Maths logic
                result = firstNumber/secondNumber;
                System.out.println("Answer: " + result);

            } else {
                System.out.println("Division by zero is not possible"); // Maths Logic
            }
        }
    }
}


