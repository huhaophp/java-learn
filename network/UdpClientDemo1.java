package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// 不需要链接服务器
public class UdpClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 建立一个 socket
        DatagramSocket socket = new DatagramSocket();
        // 建立一个包
        String msg = "服务器你好!服务器你好!";
        // 发送目标
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9090;
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, localhost, port);
        socket.send(packet);
        socket.close();
    }
}
