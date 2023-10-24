package javahomeworkweek7;
/**
 * Write a Java program to sum values of an array.
 */
public class Programme_18_SumOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}