package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class demo2 {
    public static void main(String[] args) {
        // List是一种有序链表：List内部按照放入元素的先后顺序存放，并且每个元素都可以通过索引确定自己的位置
        // List还提供了boolean contains(Object o)方法来判断List是否包含某个指定元素。
        // 此外，int indexOf(Object o)方法可以返回某个元素的索引，如果元素不存在，就返回-1
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("c");
        list.add("d");
        System.out.println(list.toString());
        // contains
        System.out.println(list.contains("awqe"));
        // indexOf
        System.out.println(list.indexOf("a"));
        // lastIndexOf 返回元素最后一次出现的位置
        System.out.println(list.lastIndexOf("a"));

        System.out.println(list.contains(new String("a")));// true
        System.out.println(list.indexOf(new String("a"))); // 0

        // List中添加的"C"和调用contains("C")传入的"C"是不是同一个实例
        // 传入的是new String("C")，所以一定是不同的实例。结果仍然符合预期，这是为什么呢?
        // 因为 list 内部不是使用 ==(引用地址相同) 比较而是使用 equals(值相等)
        // 要正确使用List的contains()、indexOf()这些方法，放入的实例必须正确覆写equals()方法，否则，放进去的实例，查找不到。
        // 我们之所以能正常放入String、Integer这些对象，是因为Java标准库定义的这些类已经正确实现了equals()方法

        List<Person> persons = new ArrayList<>();
        Person p1 = new Person("zhangsan");
        Person p2 = new Person("zhangsan");
        Person p3 = new Person("zhangsan");
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        System.out.println(persons.contains(p1)); // true;
        System.out.println(persons.indexOf(p2));// 1
        System.out.println(persons.indexOf(new Person("zhangsan"))); // -1
        System.out.println(persons.contains(new Person("zhangsan"))); // false

        //  给 Goods 类增加equals方法，使得调用indexOf()方法返回正常：
        List<Goods> items = new ArrayList<>();
        Goods g1 = new Goods("电脑", "1000", 100);
        Goods g2 = new Goods("手机", "2000", 100);
        Goods g3 = new Goods("游戏机", "3000", 100);
        items.add(g1);
        items.add(g2);
        items.add(g3);

        System.out.println(items.indexOf(new Goods("游戏机", "3000", 100)));
    }
}

class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }
}

class Goods {
    public String name;
    public String price;
    public int stock;


    public Goods(String name, String price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public boolean equals(Object g) {
        if (!(g instanceof Goods)) {
            return false;
        }
        Goods goods = (Goods) g;
        return Objects.equals(this.name, goods.name)
                && this.stock == goods.stock
                && Objects.equals(this.price, goods.price);
    }
}






