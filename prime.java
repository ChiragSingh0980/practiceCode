import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = 2;
        boolean isprime = true;
        while (div <= n - 1) {
            if (n % div == 0) {
                isprime = false;
            }
            div = div + 1;

        }
        if (isprime) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not prime");
        }
        sc.close();

    }

}
