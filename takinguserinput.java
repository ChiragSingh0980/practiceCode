import java.util.Scanner;

public class takinguserinput {
    public static void main(String[] args) {
        Scanner kunal = new Scanner(System.in);
        System.out.println("the principal value is:");
         int principal = kunal.nextInt();
         System.out.println("the rate  of interest is:");
         float rate = kunal.nextFloat();
         System.out.println("the time is in month:");
         int time = kunal.nextInt();
         double simpleinterest = principal*rate*time/(100*12);
         System.out.println("the simpleinterest is:" );
         System.out.println(simpleinterest);
         kunal.close();
        
    }

    
    
}
