package io;

import java.io.*;

public class demo4 {
    public static void main(String[] args)  {
        try {
            String source = "0.txt";
            String target = "11.txt";
            copy(source, target);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void copy(String source, String target) throws IOException {
        File sfile = new File(source);
        File tfile = new File(target);
        if (!sfile.exists()) {
            throw new FileNotFoundException("file does not exist.");
        }
        if (!tfile.exists() && !tfile.createNewFile()) {
            throw new FileNotFoundException("Target file creation failed");
        }
        FileInputStream inputStream = new FileInputStream(source);
        FileOutputStream outputStream = new FileOutputStream(target);
        int len = (int) (sfile.length());
        byte[] buffer = new byte[len];
        // 实际上 read 方法是阻塞的
        // 当读取到 len 的长度的 buffer 才会去读取下个字节
        // 这个时候存在一个指针指向读取的开始位置
        while ((inputStream.read(buffer, 0, len)) != -1) {
            outputStream.write(buffer);
        }
        outputStream.close();
        inputStream.close();
    }

}
