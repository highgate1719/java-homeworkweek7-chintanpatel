package javahomeworkweek7;
/**
 * Write a Java program to sort a numeric array and a string array.
 */
import java.util.Arrays;

public class Programme_17_Numeric_String_Array {
    public static void main(String[] args) {

        int[] num = {4, 5, 7, 6, 8};
        String[] str = {"John", "Smith"};

        Arrays.toString(num);
        Arrays.toString(str);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));

        Arrays.sort(num);
        Arrays.sort(str);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));
    }
}
