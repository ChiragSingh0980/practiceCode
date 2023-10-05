class student {
    int marks1;
    int marks2;
    int marks3;

    public student(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    void average() {

        System.out.println("The average of 3 numbers is: " + (marks1 + marks2 + marks3) / 3);
    }
}

public class Assignment {
    public static void main(String[] args) {
        student s = new student(80, 90, 70);

        s.average();
    }

}
