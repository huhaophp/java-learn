package gui;

import java.awt.*;

// GUI 第一个界面
public class demo1 {
    public static void main(String[] args) {
        Frame frame = new Frame("这是第一个Java图形化界面");
        // 设置可见性
        frame.setVisible(true);
        // 设置窗口大小
        frame.setSize(400, 400);
        // 设置背景大小
        frame.setBackground(new Color(85, 150, 68));
        // 弹出框初始化位置
        frame.setLocation(200, 200);
        // 设置大小固定
        frame.setResizable(false);
    }
}
