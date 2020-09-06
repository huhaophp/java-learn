package base;

public class demo2 {
    public static void main(String[] args) {
        // 整数的数值表示不但是精确的，而且整数运算永远是精确的，即使是除法也是精确的，因为两个整数相除只能得到结果的整数部分：
        int x = 123 / 1222;
        System.out.println(x);
        // 求余运算使用%
        int a = 10;
        int b = 20;
        System.out.println(b % a);
        // 整数的除法对于除数为0时运行时将报错，但编译不会报错。
        //        try {
        //            System.out.println(100/0);
        //        } catch (ArithmeticException e) {
        //            e.printStackTrace();
        //            System.out.println(e.getMessage());
        //        }

        // 整数由于存在范围限制，如果计算结果超出了范围，就会产生溢出，而溢出不会出错，却会得到一个奇怪的结果
        int m = 2147483640;
        int y = 15;
        int sum = m + y;
        System.out.println(sum); // -2147483641

        // 计算前N个自然数的和可以根据公示：
        // TODO: 1+2+3+n...
        int sum1 = sum(100);
        System.out.println(sum1);
    }

    /**
     * 计算前N个自然数的和可以根据
     *
     * @param n n
     * @return int
     */
    protected static int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
