package exception;

public class app {
    public static void main(String[] args) {
        try {
            test(100);
        } catch (demo1 e) {
            System.out.println(e);
        }
    }

    public static void test(int a) throws demo1 {
        System.out.println("传递为" + a);
        if (a > 10) {
            throw new demo1(a);
        }
        System.out.println("ok");
    }
}
