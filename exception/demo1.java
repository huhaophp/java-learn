package exception;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class demo1 extends Exception {
    public static void main(String[] args) {
        // 在计算机程序运行的过程中，总是会出现各种各样的错误。

        // String a = "abc";
        // int n = Integer.parseInt(a); // NumberFormatException
        // System.out.println(n);

        // 在语言层面上提供一个异常处理机制。
        // Throwable是异常体系的根，它继承自Object。Throwable有两个体系：Error和Exception，Error表示严重的错误，程序对此一般无能为力
        // OutOfMemoryError 内存耗尽
        // NoClassDefFoundError 无法加载某个class
        // StackOverflowError：栈溢出


        // 而Exception则是运行时的错误，它可以被捕获并处理。
        //NumberFormatException：数值类型的格式错误
        //FileNotFoundException：未找到文件
        //SocketException：读取网络失败

        // 捕获异常 try catch
//        try {
//            String a = "abc";
//            int b = Integer.parseInt(a);
//            System.out.println(b);
//        } catch (NumberFormatException e) {
//            // e.printStackTrace();
//            System.out.println(e.getMessage());
//            // For input string: "abc"
//        } catch (Throwable e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }

        // 在方法定义的时候，使用throws Xxx表示该方法可能抛出的异常类型。调用方在调用的时候，必须强制捕获这些异常，否则编译器会报错.
        try {
            byte[] bs = toGBK("中文");
            System.out.println(Arrays.toString(bs));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    static byte[] toGBK(String s) throws UnsupportedEncodingException {
        return s.getBytes("GBK");
    }
}
