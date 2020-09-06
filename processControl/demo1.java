package processControl;

public class demo1 {
    public static void main(String[] args) {
        // if 语句
        int a = 1;
        int c = 2;
        if (a < c) {
            System.out.println("<");
        } else {
            System.out.println("!<");
        }
        // 判断引用类型相等
        // ==表示“引用是否相等”
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
        // 要判断引用类型的变量内容是否相等，必须使用equals()方法：

        // 注意：执行语句s1.equals(s2)时，如果变量s1为null，会报NullPointerException
        String s3 = "111";
        String s4 = "111";
        // System.out.println(s3.equals(s4)); 会报NullPointerException
        System.out.println(s3 != null && s3.equals(s4));


        /**
         * 请用if ... else编写一个程序，用于计算体质指数BMI，并打印结果。
         *
         * BMI = 体重(kg)除以身高(m)的平方
         *
         * BMI结果：
         *
         * 过轻：低于18.5
         * 正常：18.5-25
         * 过重：25-28
         * 肥胖：28-32
         * 非常肥胖：高于32
         *
         */
        float weight = 65.1f;
        float height = 1.75f;
        float bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("过轻");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("正常");
        } else if (bmi >= 25 && bmi < 28) {
            System.out.println("过重");
        } else if (bmi >= 28 && bmi < 32) {
            System.out.println("肥胖");
        } else {
            System.out.println("非常肥胖");
        }
    }
}
