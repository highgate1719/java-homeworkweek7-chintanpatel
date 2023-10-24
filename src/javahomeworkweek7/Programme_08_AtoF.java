package javahomeworkweek7;

import java.util.Scanner;
/**
 * Input any alphabet from “A to F”
 * and print their city name accordingly (use if else)
 * any other alphabet should be invalid entry
 */
public class Programme_08_AtoF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alphabet 'A To F'");
        char ab = scanner.next().charAt(0);
        if ((ab != 'A') && (ab != 'B') && (ab != 'C') && (ab != 'D') && (ab != 'E') && (ab != 'F')
         )
        {
            System.out.println("INVALID ENTRY, TRY AGAIN");
        } else if (ab == 'A') {
            System.out.println("City: Ahmedabad"); // Printing statement for alphabet A
        } else if (ab == 'B') {
            System.out.println("City: Birmingham"); // Printing statement for alphabet B
        } else if (ab == 'C') {
            System.out.println("City: Cambridge"); // Printing statement for alphabet C
        } else if (ab == 'D') {
            System.out.println("City: Delhi"); // Printing statement for alphabet D
        } else if (ab == 'E') {
            System.out.println("City: Enfield"); // Printing statement for alphabet E
        } else if (ab == 'F') {
            System.out.println("City: Frankfurt"); // Printing statement for alphabet F
        } else {
            System.out.println("Hello"); // Printing statement for any other alphabet
        }
        scanner.close();
    }
}

