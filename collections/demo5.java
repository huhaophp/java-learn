package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Map
public class demo5 {
    public static void main(String[] args) {
        // Map这种键值（key-value）映射表的数据结构，作用就是能高效通过key快速查找value（元素）
        // key 不能重复 但是key对应的值可以重复
        // 始终牢记：Map中不存在重复的key，因为放入相同的key，只会把原有的key-value对应的value给替换掉。
        // map 和 list 不同的是 map 不保持顺序
        Map<Integer, Student> students = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            students.put(i, new Student(i, "student/" + i, i + 20));
        }
        // 获取ID为0的学生
        System.out.println(students.get(0).id);
        System.out.println(students.get(0).name);
        System.out.println(students.get(0).age);
        // 查询学号为10的学生
        System.out.println(students.get(10)); // null
        // 查询学号为9的学生
        System.out.println(students.get(9)); // collections.Student@60e53b93
        // 如果只是想查询某个key是否存在，可以调用boolean containsKey(K key)方法。
        System.out.println(students.containsKey(1));// true;
        // 更改学号为2的学号的信息
        System.out.println(students.get(2).name);
        students.put(2, new Student(2, "zhangsan", 20));
        System.out.println(students.get(2).name);
        // 要遍历key可以使用for each循环遍历Map实例的keySet()方法返回的Set集合
        for (Integer key : students.keySet()) {
            Student value = students.get(key);
            System.out.println(key + " = " + value);
        }
        //同时遍历key和value可以使用for each循环遍历Map对象的entrySet()集合，它包含每一个key-value映射
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            Integer key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}

class Student {
    // 学号
    public int id;
    // 名字
    public String name;
    // 年龄
    public int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
