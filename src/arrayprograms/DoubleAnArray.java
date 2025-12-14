package arrayprograms;
import java.util.Arrays;

public class DoubleAnArray {

    
    // Method to return total sum of array
    public static int returnsumOfAr(int ar[]) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    // Method to return a new array with double values
    public static int[] returnIntDoubleArray(int ar[]) {
        int newArray[] = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            newArray[i] = ar[i] * 2;
        }
        return newArray;
    }

    // Main method
    public static void main(String[] args) {

        int ar[] = {12, 14, 1234};

       
        int sum = returnsumOfAr(ar);
        System.out.println("Total sum: " + sum);

        ar = returnIntDoubleArray(ar);

        System.out.println("Doubled array: " +Arrays.toString(ar));
    }
}
