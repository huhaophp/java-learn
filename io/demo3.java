package io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

// OutputStream
// 和InputStream相反，OutputStream是Java标准库提供的最基本的输出流。
// 和InputStream类似，OutputStream也是抽象类，它是所有输出流的超类。这个抽象类定义的一个最重要的方法就是void write(int b)
public class demo3 {
    public static void main(String[] args) throws IOException {
        try {
            OutputStream outputStream = new FileOutputStream("0.txt");
            outputStream.write("我是校长".getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // OutputStream实现类
        byte[] data;
        try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            output.write("Hello ".getBytes("UTF-8"));
            output.write("world!".getBytes("UTF-8"));
            data = output.toByteArray();
        }
        System.out.println(Arrays.toString(data));
    }
}
