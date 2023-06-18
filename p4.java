import java.util.*;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int Gap = sc.nextInt();
        int cfv = start;   //cfv=currentfahrenhietvalue
        while (cfv <= end) {
            double cv = ((5.0 / 9) * (cfv - 32)); //celsius value
            System.out.println(cfv + "\t" + cv);
            cfv = cfv + Gap;
            sc.close();

        }

    }

}
