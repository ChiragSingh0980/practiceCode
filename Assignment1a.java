import java.util.*;
import java.util.Scanner;

class Minmax {

    public static void minMax(int[] arr) {
        long min_value = 0;
        long max_value = 0;
        int n = arr.length;

        // Sort array before calculating
        Arrays.sort(arr);

        for (int i = 0, j = n - 1; i < n - 1; i++, j--) {

            min_value += arr[i];
            max_value += arr[j];
        }

        System.out.print("Minimum value is " + min_value);
        System.out.print("Maximum value is " + max_value);
    }

    public class Assignemet1s {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter elements of the array");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            minMax(arr);
            sc.close();
        }
    }
}