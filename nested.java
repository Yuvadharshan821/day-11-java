import java.util.*;interface out {
    void outm();
    interface in {
        void innm();
    }
}

class Main implements out.in {
    public void innm() {
        System.out.println("hello");
    }

    public static void main(String args[]) {
        Main n = new Main();
        n.innm();
    }
}
