class shape {
    void draw() {
        System.out.println("draw shape");
    }

    void erase() {
        System.out.println("erase shape");
    }
}

class circle extends shape {
    void draw() {
        System.out.println("draw circle");
    }

    void erase() {
        System.out.println("erase circle");
    }
}

class triangle extends shape {
    void draw() {
        System.out.println("draw triangle");
    }

    void erase() {
        System.out.println("erase triangle");
    }
}

class square extends shape {
    void draw() {
        System.out.println("draw square");
    }

    void erase() {
        System.out.println("erase square");
    }
}

public class Lab2 {

    public static void main(String[] args) {
        shape s1 = new shape();
        circle c1 = new circle();
        square s2 = new square();
        triangle t1 = new triangle();
        s1.draw();
        s1.erase();
        c1.draw();
        c1.erase();
        s2.draw();
        s2.erase();
        t1.draw();
        t1.erase();

        System.out.println("done");
    }
}
