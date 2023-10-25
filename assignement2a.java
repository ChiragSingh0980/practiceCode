import java.util.Scanner;

class student {
    int enrollmentNumber;
    String Name;
    String Branch;
    int Semester;
    // double sum;

    public student(int enrollmentNumber, String Name, String Branch, int Semester) {
        this.enrollmentNumber = enrollmentNumber;
        this.Name = Name;
        this.Branch = Branch;
        this.Semester = Semester;
    }

    // public student() {
    // }

    void display() {
        System.out.println("ENROLLMENT NUMBER IS:" + enrollmentNumber);
        System.out.println("NAME IS:" + Name);
        System.out.println("BRANCH IS:" + Branch);
        System.out.println("SEMESTER IS:" + Semester);
        // System.out.println(" total marks is:" + sum);
    }
}

class MST extends student {
    int enrollmentNumber;
    String Name;
    String Branch;
    int Semester;
    double sum;

    public MST(int enrollmentNumber, String Name, String Branch, int Semester) {
        super(enrollmentNumber, Name, Branch, Semester);
        this.Name = Name;
        this.Branch = Branch;
        this.Semester = Semester;

    }

    public int getEnrollmentnumber() {
        return enrollmentNumber;
    }

    public String getname() {
        return Name;

    }

    public String getbranch() {
        return Branch;

    }

    public int getsem() {
        return Semester;
    }

    int[] marks;

    double total;
    int n;

    public double sum(int marks[]) {
        sum = 0; // initialize sum
        int i;

        // Iterate through all elements and add them to sum
        for (i = 0; i < n; i++)
            sum += marks[i];

        return sum;
    }

    public void percentage(double sum) {

        System.out.println((sum * 100) / total);
    }

    void showdisplay(double sum) {
        // System.out.println("ENROLLMENT NUMBER IS:" + enrollmentNumber);
        // System.out.println("NAME IS:" + Name);
        // System.out.println("BRANCH IS:" + Branch);
        // System.out.println("SEMESTER IS:" + Semester);
        System.out.println(" total marks is:" + sum);

    }

}

class PUT extends MST {

    public PUT(int enrollmentNumber, String Name, String Branch, int Semester) {
        super(enrollmentNumber, Name, Branch, Semester);
        this.Name = Name;
        this.Branch = Branch;
        this.Semester = Semester;
    }

}

public class assignement2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the enrollment Number");
        int enrollmentNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of student");
        String Name = sc.nextLine();
        System.out.println("Enter your Branch name");
        String Branch = sc.nextLine();
        System.out.println("Enter your semester");
        int Semester = sc.nextInt();
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter elements of the array");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        sc.close();

        student s = new student(enrollmentNumber, Name, Branch, Semester);
        s.display();
        MST m = new MST(enrollmentNumber, Name, Branch, Semester);

        double sum = m.sum(marks);
        m.showdisplay(sum);
        m.percentage(sum);
    }

}
