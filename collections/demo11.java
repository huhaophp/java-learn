package collections;

import java.util.*;

// SET
// Map用于存储key-value的映射，对于充当key的对象，是不能重复的，并且，不但需要正确覆写equals()方法，还要正确覆写hashCode()方法。
//
// 如果我们只需要存储不重复的key，并不需要存储映射的value，那么就可以使用Set
public class demo11 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(set.add("abc")); // true
        System.out.println(set.add("xyz")); // true
        System.out.println(set.add("xyz")); // false，添加失败，因为元素已存在
        System.out.println(set.contains("xyz")); // true，元素存在
        System.out.println(set.contains("XYZ")); // false，元素不存在
        System.out.println(set.remove("hello")); // false，删除失败，因为元素不存在
        System.out.println(set.size()); // 2，一共两个元素

        // Set接口并不保证有序
        Set<Integer> iset = new TreeSet<>();
        iset.add(1);
        iset.add(50);
        iset.add(20);
        iset.add(5);
        System.out.println(iset.toString());
        // 循环 set
        for (Integer s : iset) {
            System.out.println(s);
        }


        // 在聊天软件中，发送方发送消息时，遇到网络超时后就会自动重发，因此，接收方可能会收到重复的消息，在显示给用户看的时候，需要首先去重。
        // 请练习使用Set去除重复的消息：
        List<Message> received = new ArrayList<>();

        received.add(new Message(1, "Hello!"));
        received.add(new Message(1, "Hello!"));
        received.add(new Message(2, "发工资了吗？"));
        received.add(new Message(2, "发工资了吗？"));
        received.add(new Message(3, "去哪吃饭？"));
        received.add(new Message(3, "去哪吃饭？"));
        received.add(new Message(4, "Bye"));

        List<Message> displayMessages = process(received);
        for (Message message : displayMessages) {
            System.out.println(message.text);
        }
    }

    public static List<Message> process(List<Message> received) {
        Set<Integer> exists = new HashSet<>();
        // 去除重复的消息
        for (int i = 0; i < received.size(); i++) {
            if (!exists.add(received.get(i).sequence)) {
                // 删除当前 key
                received.remove(i);
                // 索引-1,以为上面删除了一个
                i--;
            }
        }
        return received;
    }
}

class Message {
    public final int sequence;
    public final String text;

    public Message(int sequence, String text) {
        this.sequence = sequence;
        this.text = text;
    }
}
