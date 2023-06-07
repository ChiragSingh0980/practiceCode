class worker {
    float salary = 40000;
}

class Gaurav extends worker {
    int bonus = 10000;
}

public class Employee {
    public static void main(String[] args) {
        Gaurav g = new Gaurav();
        System.out.println("Gaurav salary is " + g.salary);
        System.out.println("Bonus of Gaurav is " + g.bonus);

    }

}
