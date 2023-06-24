import java.util.*;

class Admin {
    double price;

    // public Admin()
    // {
    // this.price = price;
    // }
    void setPrice() {
        System.out.println("Enter the Petrol price: ");
        Scanner sc = new Scanner(System.in);
        sc.nextDouble();
        sc.close();
    }
    // private void checkQuantity() {
    // System.out.println("Quantity of the petrol: ");
    // }
    // private void addRepresentative() {
    // System.out.println("Representative of the petrol pump ");

    // }

}

class Customer extends Admin {
    public Customer(double price) {
        super();

    }

    public Customer() {
    }

    double quantity;
    double amount;
    double price = super.price;

    /*
     * public Customer(int price){
     * super(price);
     * this.price = price;
     * }
     */
    public void setAmount() {
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        double price = super.price;
        double quantity = amount / price;
        System.out.println("Quantity dispensed: " + quantity);
        viewDetail(amount);
        sc.close();
    }

    public void setQuantity() {
        System.out.println("Enter the quantity: ");
        Scanner sc = new Scanner(System.in);
        double quantity = sc.nextDouble();
        double price = super.price;
        double amount = quantity * price;
        System.out.println("Quantity: " + quantity);
        System.out.println("Amount: " + amount);
        viewDetail(amount);
        sc.close();
    }

    public void viewDetail(double amount) {
        double price = super.price;
        System.out.println("Quantity dispensed: " + amount / price);
        System.out.println("Pay: " + amount);
    }
}

public class PetrolPump {
    public static void main(String[] args) {
        Admin a = new Admin();
        a.setPrice();
        System.out.println("Enter 1 for Quantity ");
        System.out.println("Enter 2 for Amount ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        switch (b) {
            case 1:
                Customer c = new Customer();
                c.setQuantity();
                break;
            case 2:
                Customer d = new Customer();
                d.setAmount();
                break;
        }
        sc.close();

    }
}
