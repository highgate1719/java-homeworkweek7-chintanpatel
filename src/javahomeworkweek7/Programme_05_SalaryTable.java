package javahomeworkweek7;
/**
 * Write a programme to input employee id, name, basic salary then find
 * HRA, TA, DA, PF and Gross salary
 */

import java.util.Scanner;

public class Programme_05_SalaryTable {

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // created scanner to read a data
        System.out.println("Enter Employee ID: "); // printing a statement
        String EmployeeID = scanner.nextLine(); // going to next line after entering a data
        System.out.println("Enter Employee Name: ");
        String Name = scanner.nextLine(); // going to next line after entering a data
        System.out.println("Enter Basic Salary: ");

        double BasicSalary = scanner.nextInt(); // basic salary to enter

        // calculation

        double HRA = 10 * BasicSalary / 100; // 10% of basic salary
        double DA = 8 * BasicSalary / 100; // 8% of basic salary
        double TA = 9 * BasicSalary / 100; // 9 % of basic salary
        double PF = 20 * BasicSalary / 100; // 20% of basic salary

        // calculate gross salary
        double grossSalary = BasicSalary + HRA + DA + TA - PF;
        scanner.close(); // scanner closed

        // Print salary slip with using concatenation
        System.out.println(" __________________________________");
        System.out.println("|            Salary Slip           |");
        System.out.println("|__________________________________|");
        System.out.println("| Employee Id    :    " + EmployeeID + "           |");
        System.out.println("| Employee Name  :    " + Name + "       |");
        System.out.println("|__________________________________|");
        System.out.println("| Basic Salary  :    " + BasicSalary + "        |");
        System.out.println("| HRA 10%       :    " + HRA + "         |");
        System.out.println("| TA 8%         :    " + TA + "         |");
        System.out.println("| DA 9%         :    " + DA + "         |");
        System.out.println("| PF 20%        :    " + PF + "         |");
        System.out.println("|__________________________________|");
        System.out.println("| Gross Salary  :    " + grossSalary + "        |");
        System.out.println("|==================================|");

    }


}
