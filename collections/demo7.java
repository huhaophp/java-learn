package collections;

import java.util.HashMap;
import java.util.Map;

public class demo7 {
    public static void main(String[] args) {
        Map<String, person> map = new HashMap<>();
        map.put("a", new person("Xiao Ming"));
        map.put("b", new person("Xiao Hong"));
        map.put("c", new person("Xiao Jun"));
        System.out.println(map);
        // HashMap之所以能根据key直接拿到value，
        // 原因是它内部通过空间换时间的方法，用一个大数组存储所有value，并根据key直接计算出value应该存储在哪个索引
        // 0 a =====> Person()
        // 1 b =====> Person()

        // 当我们使用key存取value的时候，就会引出一个问题：
        // 我们放入Map的key是字符串"a"，但是，当我们获取Map的value时，传入的变量不一定就是放入的那个key对象。
        //
        // 换句话讲，两个key应该是内容相同，但不一定是同一个对象
        String key1 = "a";
        Map<String, Integer> scores = new HashMap<>();
        scores.put(key1, 1);

        String key2 = new String("a");
        scores.put(key2, 2);
        System.out.println(scores.get(key2));
        System.out.println(scores.get(key1));
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());

        // false
        System.out.println(key1 == key2);
        // true
        System.out.println(key1.equals(key2));
    }
}

class person {

    public String name;

    public person(String name) {
        this.name = name;
    }
}