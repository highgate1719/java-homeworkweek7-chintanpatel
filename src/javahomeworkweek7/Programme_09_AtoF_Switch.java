package javahomeworkweek7;
import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (function switch)
 * if any other alphabet should be invalid entry
 */

public class Programme_09_AtoF_Switch {
    public static void main(String[] args) {
        cityName();
    }

    public static void cityName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet (A to F): ");
        String alphabet = scanner.next().toUpperCase();
        String CityName;
        switch (alphabet) {
            case "A":
                System.out.print("CityName - Ahmedabad");
                break;
            case "B":
                System.out.print("CityName - Birmingham");
                break;
            case "C":
                System.out.print("CityName - Cambridge");
                break;
            case "D":
                System.out.print("CityName - Delhi");
                break;
            case "E":
                System.out.print("CityName - Edinburgh");
                break;
            case "F":
                System.out.print("CityName - Frankfurt");
            default:
                System.out.println("CityName = Invalid entry");
                break;
        }
        scanner.close();
    }
}