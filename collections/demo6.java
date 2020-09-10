package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo6 {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1("Bob", 78));
        list.add(new Student1("Alice", 85));
        list.add(new Student1("Brush", 66));
        list.add(new Student1("Newton", 99));
        Students holder = new Students(list);
        System.out.println(holder.getScore("Bob") == 78 ? "测试成功!" : "测试失败!");
        System.out.println(holder.getScore("Alice") == 85 ? "测试成功!" : "测试失败!");
        System.out.println(holder.getScore("Tom") == -1 ? "测试成功!" : "测试失败!");
    }
}

class Students {
    List<Student1> list;
    Map<String, Integer> cache;

    Students(List<Student1> list) {
        this.list = list;
        cache = new HashMap<>();
    }

    /**
     * 根据name查找score，找到返回score，未找到返回-1
     */
    int getScore(String name) {
        // 先在Map中查找:
        Integer score = this.cache.get(name);
        if (score == null) {
            if ((score = findInList(name)) != null) {
                this.cache.put(name, findInList(name));
            }
        }
        // intValue 把 integer 类型强制转成 int 类型
        return score == null ? -1 : score.intValue();
    }

    Integer findInList(String name) {
        for (Student1 ss : this.list) {
            if (ss.name.equals(name)) {
                return ss.score;
            }
        }
        return null;
    }
}

class Student1 {
    String name;
    int score;

    Student1(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
