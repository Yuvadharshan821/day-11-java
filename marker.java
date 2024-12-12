import java.util.*;
interface Printable {
    void print();
}

class H implements Printable {
    public void print() {
        System.out.println("hello Student");
    }
}

class Main {
    public static void main(String[] args) {
        H f = new H();
        f.print();
    }
}
