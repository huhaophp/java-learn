package exception;

public class demo1 extends Exception {

    private int detail;

    public demo1(int a) {
        this.detail = a;
    }

    @Override
    public String toString() {
        return "{demo1 exception}---->" + detail;
    }
}
