package javahomeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input
 * any number and find out if it’s odd or even
 */
public class Programme_06_Even_Odd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " Is Even Number ");
    } else {
            System.out.println(num + " Is Odd Number");
            scanner.close();
        }

    }

}
