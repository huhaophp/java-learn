package base;

/**
 * 浮点数运算
 */
public class demo3 {
    public static void main(String[] args) {
        // 在计算机中，浮点数虽然表示的范围大，但是，浮点数有个非常重要的特点，就是浮点数常常无法精确表示
        float a = 3.14f;
        float b = 3.14f;
        System.out.println(a == b);
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        // 观察x和y是否相等:
        System.out.println(x);
        System.out.println(y);

        double d = 1.2 + 24 / 5; // 5.2
        System.out.println(d);

        // 强制转型
        int n1 = (int) 1.2;
        int n4 = (int) 1.2e20; // 2147483647
        System.out.println(n1);
        System.out.println(n4);

        // 如果要进行四舍五入，可以对浮点数加上0.5再强制转型：
        float f1 = 1.34f;
        double f2 = 1.54;
        System.out.println((int) (f1 + 0.5));
        System.out.println((int) (f2 + 0.5));
        System.out.println(rounding(f1));
    }

    public static int rounding(double d) {
        return (int) (d + 0.5);
    }
}
