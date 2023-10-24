package javahomeworkweek7;

/**
 * Write a java program to print the numbers between 1 - 100
 * which can be divided by 3
 * and 5 separately.
 */
public class Programme_11_Divisible_3_5 {

    public static void main(String[] args) {

        // Print numbers divided by 3
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }

        // Print numbers divided by 5
        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ", ");
        }
    }

}
