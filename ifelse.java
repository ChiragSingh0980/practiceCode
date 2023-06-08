import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  first number");
        int num1  = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        int  biggest = 0;
        biggest = num1 < num2 ? num1 : num2;
        System.out.println(biggest);
        sc.close(); 
        
        
            
        }
    }
    

