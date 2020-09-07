package gui;

import java.awt.*;

public class demo2 {
    public static void main(String[] args) {
        MyFrame frame1 = new MyFrame(100, 100, 200, 200, Color.green);
        MyFrame frame2 = new MyFrame(300, 100, 200, 200, Color.red);
        MyFrame frame3 = new MyFrame(100, 300, 200, 200, Color.black);
        MyFrame frame4 = new MyFrame(300, 300, 200, 200, Color.gray);
    }
}

class MyFrame extends Frame {
    static int id = 0;

    public MyFrame(int x, int y, int w, int h, Color color) {
        super("MyFrame" + (++id));
        setVisible(true);
        // 设置窗口大小
        setSize(w, h);
        // 设置背景大小
        setBackground(color);
        // 弹出框初始化位置
        setLocation(x, y);
        // 设置大小固定
        setResizable(false);
    }
}
