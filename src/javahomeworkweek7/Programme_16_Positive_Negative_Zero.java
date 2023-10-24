package javahomeworkweek7;
/**
 * Write the java program to check if enter number is “POSITIVE”,
 * “NEGATIVE” or
 * “ZERO”
 */

import java.util.Scanner;

public class Programme_16_Positive_Negative_Zero {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
            sc.close();
        }
    }
}
