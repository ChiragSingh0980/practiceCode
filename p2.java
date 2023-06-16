import java.util.*;

public class p2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num[] = new int[5];

        System.out.println("Enter a number: ");
        for (int i = 0; i < 5; i++)// system asks for no more than 5 numbers
        {
            num[i] = input.nextInt();
        }
        for (int j = 0; j < 5; j++) {
            if (num[j] < 10)
                System.out.print(num[j] + "  ");
            else
                System.out.print(num[j] + " ");
            for (int i = 0; i < num[j]; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();

    }

}
