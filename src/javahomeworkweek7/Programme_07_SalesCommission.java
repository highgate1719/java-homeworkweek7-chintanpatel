package javahomeworkweek7;
/**
 * Write a java program input sales id, seller's name, sales amount,
 * and salary basic and then fined this sales
 */

import java.util.Scanner;

public class Programme_07_SalesCommission {
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // scanner created
        System.out.println("Enter Sales Id: "); // printing statement for user to enter sales id
        String salesID = scanner.next(); // going to next line
        System.out.println("Enter Seller's Name: ");
        String sellersName = scanner.next();
        System.out.println("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.println("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        scanner.close(); // scanner closed

        // Calculation of Commission
        if (salesAmount >= 50000) { // logic given in question
            System.out.println("Commission: " + salesAmount * 35 / 100); // printing a statement is sales amount is >= 50000
        } else if (salesAmount >= 35000) {
            System.out.println("Commission: " + salesAmount * 20 / 100); // printing a statement is sales amount is >= 35000
        } else if (salesAmount >= 20000) {
            System.out.println("Commission: " + salesAmount * 10 / 100); // printing a statement is sales amount is >= 20000
        } else if (salesAmount >= 10000) {
            System.out.println("Commission: " + salesAmount * 5 / 100); // printing a statement is sales amount is >= 10000
        } else if (salesAmount >= 0) {
            System.out.println("Commission: " + salesAmount * 2 / 100); // printing a statement is sales amount is >= 0
        } else {
            System.out.println(salesAmount + " is invalid input"); // printing a statement is sales amount is invalid
        }

    }






}



