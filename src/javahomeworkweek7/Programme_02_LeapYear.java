package javahomeworkweek7;
import java.util.Scanner;
/**
 * java program to input any year like (ex.2007)
 * and find out if it is leap year or not
 */

public class Programme_02_LeapYear {

    public static void main(String[] args) {
        int y;
        System.out.println("Enter any Year  ");
        Scanner r = new Scanner(System.in);
        y = r.nextInt();
        r.close();

        if (y % 100 == 0 && y % 400 == 0 || y % 100 != 0 && y % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Yer");

        }
    }
}