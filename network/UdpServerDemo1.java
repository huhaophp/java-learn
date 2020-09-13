package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

// 还是等待客户端的链接
public class UdpServerDemo1 {
    public static void main(String[] args) throws Exception {
        // 开放端口
        DatagramSocket socket = new DatagramSocket(9090);
        // 接收数据包
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);
        // 柱塞
        socket.receive(packet);
        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(Arrays.toString(packet.getData()));
        System.out.println(new String(packet.getData(), 0, packet.getLength()));
        socket.close();
    }
}
