package io;

import java.io.*;

// InputStream
// InputStream就是Java标准库提供的最基本的输入流。它位于java.io这个包里。java.io包提供了所有同步IO的功能。
public class demo2 {
    public static void main(String[] args) {
        try {
            //  singleByteReadStream("0.txt");
            //  multiSubsectionReadStream("0.txt");
            //  ByteArrayInputStreamTest();
            testFileInputStreamToString();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void singleByteReadStream(String filename) throws IOException {
        InputStream input = null;
        // 创建一个FileInputStream对象:
        input = new FileInputStream(filename);
        int n;
        // 利用while同时读取并判断
        while ((n = input.read()) != -1) {
            System.out.println(n);
        }
        input.close();
    }

    // 在读取流的时候，一次读取一个字节并不是最高效的方法。
    // 很多流支持一次性读取多个字节到缓冲区，对于文件和网络流来说，利用缓冲区一次性读取多个字节效率往往要高很多。
    // InputStream提供了两个重载方法来支持读取多个字节
    // int read(byte[] b)：读取若干字节并填充到byte[]数组，返回读取的字节数
    // int read(byte[] b, int off, int len)：指定byte[]数组的偏移量和最大填充数
    public static void multiSubsectionReadStream(String filename) throws IOException {
        InputStream input = null;
        // 创建一个FileInputStream对象:
        input = new FileInputStream(filename);
        byte[] buffer = new byte[1000];
        int n;
        // 利用while同时读取并判断
        // read 阻塞
        while ((n = input.read(buffer)) != -1) {
            System.out.println("read " + n + " bytes.");
        }
        input.close();
    }

    // 字节数组输入流读取
    public static void ByteArrayInputStreamTest() {
        byte[] data = {50, 51, 52};
        try (InputStream input = new ByteArrayInputStream(data)) {
            int n;
            while ((n = input.read()) != -1) {
                System.out.println((char) n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testFileInputStreamToString() throws IOException {
        try (InputStream input = new FileInputStream("0.txt")) {
            StringBuilder stringBuffer = new StringBuilder();
            byte[] buffer = new byte[1024];
            while (input.read(buffer) != -1) {
                stringBuffer.append(new String(buffer));
            }
            System.out.println(stringBuffer.toString());
        }
    }
}
