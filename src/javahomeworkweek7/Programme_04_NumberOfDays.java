package javahomeworkweek7;

/**
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 */
public class Programme_04_NumberOfDays {
    public static boolean isLeapYear(int year) { //main method

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) && (year >= 1 && year <= 9999)) { // leap year logic
            System.out.println("True, " + year + " is leap year"); // print true statement if condition is true
            return true; // return statement because method is not void

        } else if (year <= 1 || year >= 9999) {
            System.out.println("False, " + year + " is not in a range (1-9999)"); // print false statement if condition is false
            return false;

        } else {
            System.out.println("False, " + year + " is not a leap year"); // print false statement if condition is false
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (year < 0 || year > 9999) {
            System.out.println(-1);
            return -1;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: // similar days in a months declared together
                System.out.println(31);
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11: // similar days in a months declared together
                System.out.println(30);
                break;

            default:
                System.out.println(-1);
        }
        return month;
    }
    public static void main(String[] args) {
        // calling static method to main method
        isLeapYear(-1600); // false
        isLeapYear(1600); // true
        isLeapYear(2017); // false
        isLeapYear(2000); // true

        getDaysInMonth(1, 2020); // 31 days
        getDaysInMonth(2, 2020); // 29 days
        getDaysInMonth(2, 2018); // 28 days
        getDaysInMonth(-1, 2020); // return -1, because data is invalid
        getDaysInMonth(1, -2020); // return -1, because data is invalid
    }

}
