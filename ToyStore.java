import java.util.Scanner;

class customer {
    int age;
    double price;
    String gender;

    public customer(int age, double price, String gender) {
        this.age = age;
        this.price = price;
        this.gender = gender;
    }

    void showDetails() {
        System.out.println("Enter the Age: " + age);
        System.out.println("Enter the Gender: " + gender);
        System.out.println("Enter the Bugdet: " + price);
    }
}

class Toy {
    int age;
    double price;
    String gender;

    public Toy(int age, double price) {
        this.age = age;
        this.price = price;

    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public String getGender() {
        return gender;
    }

}

class Boardgame extends Toy {
    public Boardgame(int age, int price) {
        super(age, price);
        this.age = age;
        this.price = price;

    }

    void board(int age, int price) {
        System.out.println("You can take Boardgames");
        if (age < 8 && price < 50) {
            System.out.println("The game is Monopoly");
        } else {
            System.out.println("No games");
        }
    }
}

class GameCollection extends Toy {
    public GameCollection(int age, int price) {
        super(age, price);
        this.age = age;
        this.price = price;
    }

    void game(int age, int price) {
        System.out.println("You can take from gamecollection ");
        if (age > 5 && price < 50) {
            System.out.println("You can take chess: 50");
        } else if (age < 6 && price < 50) {
            System.out.println("You can take car-game: 40");
        } else {
            System.out.println("No games");
        }

    }
}

public class ToyStore {
    public static void main(String[] args) {
        System.out.println("Welcome to the Toy Store");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bugdet: ");
        int price = sc.nextInt();
        System.out.println("Enter the Gender: ");
        String gender = sc.next();
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();

        sc.close();
        customer c = new customer(age, price, gender);
        c.showDetails();
        System.out.println("...................................................");
        Toy t = new Toy(age, price);
        t.getAge();
        t.getGender();
        t.getPrice();
        System.out.println(".................................................");
        Boardgame b = new Boardgame(age, price);
        b.board(age, price);
        System.out.println("........................................");
        GameCollection g = new GameCollection(age, price);
        g.game(age, price);

    }

}
