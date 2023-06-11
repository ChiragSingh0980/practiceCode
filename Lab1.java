class Student {
    private String name;
    private int id;
    private int gpa;

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public int getGpa() {
        return gpa;
    }

    public String toString() {
        return toString();
    }

}

class Undergrad extends Student {
    private int year;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return toString();
    }

}

class Graduate extends Student {

    private String thesisTitle;

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;

    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public String toString() {
        return toString();
    }

}

public class Lab1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Gaurav katiyar");
        System.out.println(s.getName());
        s.setId(5);
        System.out.println(s.getId());
        s.setGpa(8);
        System.out.println(s.getGpa());
        // System.out.println(s.toString());

        Undergrad u = new Undergrad();
        u.setYear(2024);
        System.out.println(u.getYear());
        // System.out.println(u.toString());

        Graduate g = new Graduate();
        g.setThesisTitle("cs");
        System.out.println(g.getThesisTitle());

    }

}
