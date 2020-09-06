package base;

public class demo1 {
    public static void main(String[] args) {
        System.out.println("hello world");
        // 变量
        int x = 1;
        String s = "s";
        System.out.println(x);
        System.out.println(s.length());
        // 重新赋值
        x = 10;
        System.out.println(x);
        int y = x;
        System.out.println(y);
        y = y + 100;
        System.out.println(y);
        System.out.println(x);

        // 基本数据类型：

        // 整数类型：byte，short，int，long
        byte a = 1; // 1 byte
        short b = 2;// 2 byte
        int c = 3; //  4 byte
        long d = 4l;// 8 byte
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        // 浮点数类型：float，double/4/8 byte
        float aa = 1.1f;
        double bb = 1.1;
        System.out.println(aa == bb);
        System.out.println(aa);
        System.out.println(bb);
        // 布尔类型：boolean
        boolean abool = true;
        boolean bbool = false;
        System.out.println(abool);
        System.out.println(bbool);
        // 字符类型：char
        // char类型使用单引号'，且仅有一个字符，要和双引号"的字符串类型区分开。
        // 字符类型char表示一个字符。Java的char类型除了可表示标准的ASCII外，还可以表示一个Unicode字符：
        char aaaa = 'a';// 2
        char bbbb = '中';
        System.out.println(aaaa);
        System.out.println(bbbb);
        // 引用类型
        String nb = "nb";
        // 常量
        final double PI = 3.14;
        double r = 5.0;
        // PI = 300; // compile error: 无法为最终变量PI分配值
        System.out.println(PI);
        System.out.println(r);
        // var关键字
        StringBuilder sb = new StringBuilder();
        // 这个时候，如果想省略变量类型，可以使用var关键字：
        // jdk 11 才可以使用
        // var sb1 = new StringBuilder();
        // System.out.println(sb1);
    }
}
