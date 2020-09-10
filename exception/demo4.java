package exception;
// 使用断言
public class demo4 {
    public static void main(String[] args) {
        double x = Math.abs(-123.45);
        assert x >= 0 : "x must >= 0";
        System.out.println(x);
    }
}
