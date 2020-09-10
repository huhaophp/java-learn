package collections;

import java.util.*;

public class demo1 {
    public static void main(String[] args) {
        // Java标准库自带的java.util包提供了集合类：Collection，它是除Map外所有其他集合类的根接口。Java的java.util包主要提供了以下三种类型的集合：
        // List：一种有序列表的集合，例如，按索引排列的Student的List；
        // Set：一种保证没有重复元素的集合，例如，所有无重复名称的Student的Set；
        // Map：一种通过键值（key-value）查找的映射表集合，例如，根据Student的name查找对应Student的Map。
        // list
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        // List还允许添加null：
        list.add(null);
        System.out.println(list.get(3));
        // JDK9 除了使用ArrayList和LinkedList，我们还可以通过List接口提供的of()方法，根据给定元素快速创建List：
        // 遍历 list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 但这种方式并不推荐，一是代码复杂，二是因为get(int)方法只有ArrayList的实现是高效的，换成LinkedList后，索引越大，访问速度越慢
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
        // Java的for each循环本身就可以帮我们使用Iterator遍历
        for (String s : list) {
            System.out.println(s);
        }
        // List和Array转换
        Object[] array = list.toArray();
        for (Object s : array) {
            System.out.println(s);
        }
        // 第二种方式是给toArray(T[])传入一个类型相同的Array，List内部自动把元素复制到传入的Array中
        List<String> list2 = Arrays.asList("1", "2");
        String[] array2 = list2.toArray(new String[0]);
        for (String s : array2) {
            System.out.println(s);
        }
        // 对于JDK 11之前的版本，可以使用Arrays.asList(T...)方法把数组转换成List。
        String[] arr1 = {"1", "2"};
        List<String> list3 = Arrays.asList(arr1);
        System.out.println(list3.toString());
        // 给定一组连续的整数，例如：10，11，12，……，20，但其中缺失一个数字，试找出缺失的数字：

        int s = 10;
        int e = 20;
        List<Integer> list4 = new ArrayList<>();
        for (int i = 10; i <= 20; i++) {
            list4.add(i);
        }
        System.out.println(list4.toString());
        // 删除一个元素
        Integer res = list4.remove(10);
        System.out.println(res);
        System.out.println(list4.toString());
        int found = findMissingNumberByOrderly(10, 20, list4);
        System.out.println(found);
//        Collections.shuffle(list4);
//        System.out.println(list4.toString());
        int found1 = findMissingNumberByDisorder(10, 20, list4);
        System.out.println(found1);
    }

    public static int findMissingNumberByOrderly(int start, int end, List<Integer> list) {
        if (end < start) {
            throw new IllegalArgumentException("end error");
        }
        int found = 0;
        if ((end - start + 1) == list.size()) {
            return found;
        }
        found = end;
        for (Integer item : list) {
            if (item != start) {
                found = start;
                break;
            }
            start++;
        }
        return found;
    }

    // 无序
    public static int findMissingNumberByDisorder(int start, int end, List<Integer> list) {
        Collections.sort(list);
        return findMissingNumberByOrderly(start, end, list);
    }
}
