import java.util.Scanner;

interface Sum {
    void show_sum();

}

interface Difference {
    void show_diff();
}

interface Product {
    void show_prod();
}

class Calculate implements Sum, Difference, Product {
    int a, b, c;

    public Calculate(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void show_sum() {

        System.out.println("The sum of the variables is:" + (a + b + c));
        System.out.println("The average of variables is:" + ((a + b + c) / 3));
    }

    public void show_diff() {
        System.out.println("The difference between first and third data member");
        System.out.println(a - c);
        // if (a < c) {
        // System.out.println("C is greater");
        // } else {
        // System.out.println("a is greater");
        // }
    }

    public void show_prod() {
        System.out.println("The cube of second data member");
        System.out.println(b * b * b);
    }
}

public class assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first data member:");
        int a = sc.nextInt();
        System.out.println("Enter second data member:");
        int b = sc.nextInt();
        System.out.println("Enter third data member:");
        int c = sc.nextInt();
        Calculate cal = new Calculate(a, b, c);
        cal.show_sum();
        cal.show_diff();
        cal.show_prod();
        sc.close();
    }

}
