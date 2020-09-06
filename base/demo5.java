package base;

// 字符和字符串
public class demo5 {
    public static void main(String[] args) {
        // 因为Java在内存中总是使用Unicode表示字符，所以，一个英文字符和一个中文字符都用一个char类型表示，它们都占用两个字节。
        // 要显示一个字符的Unicode编码，只需将char类型直接赋值给int类型即可：
        int n1 = 'A'; // 字母“A”的Unicodde编码是65
        int n2 = '中'; // 汉字“中”的Unicode编码是20013
        System.out.println(n1);
        System.out.println(n2);

        // 字符串类型
        String s = ""; // 空字符串，包含0个字符
        String s1 = "A"; // 包含一个字符
        String s2 = "ABC"; // 包含3个字符
        String s3 = "中文 ABC"; // 包含6个字符，其中有一个空格


        // 字符串连接
        String hello = "hello";
        String world = "world";
        System.out.println(hello + " " + world);
        // 如果用+连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串
        int n111 = 22;
        float n222 = 11.11f;
        System.out.println(n111 + " " + n222);

        // 多行字符串'
        String content = "adasdas\n" +
                "asdas\n" +
                "adas";
        System.out.println(content);
        // 从Java 13开始，字符串可以用"""..."""表示多行字符串（Text Blocks）了。举个例子：


        // 不可变特性
        // Java的字符串除了是一个引用类型外，还有个重要特点，就是字符串不可变
        String ss = "hello";
        System.out.println(ss); // 显示 hello
        ss = "world";
        System.out.println(ss); // 显示 world
        // 原来的字符串"hello"还在，只是我们无法通过变量s访问它而已。因此，字符串的不可变是指字符串内容不可变
        String v = "hello";
        String t = v;
        v = "world";
        System.out.println(t); // t是"hello"还是"world"?
        int a = 72;
        int b = 105;
        int c = 65281;
        System.out.println((char) a + "" + (char) b + "" + (char) c);
    }
}
