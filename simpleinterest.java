
public class simpleinterest {
    static void principal(int p) {
        System.out.println("principal p is: " + p);
    }

    static void rate(double d) {
        System.out.println("rate of interest is: " + d);
    }

    static void time(int t) {
        System.out.println("time is in month : " + t);
    }

    static void Simpleinterest(int p, double r, int t) {
        System.out.println("The Simpleinterest is " + (p * r * t / (100 * 12)));
    }

    public static void main(String[] args) {
        principal(10000);
        rate(5.0);
        time(5);
        Simpleinterest(10000, 5.0, 5);

    }

}
