package collections;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

// treeMap
public class demo9 {
    // 我们已经知道，HashMap是一种以空间换时间的映射表，
    // 它的实现原理决定了内部的Key是无序的，即遍历HashMap的Key时，其顺序是不可预测的（但每个Key都会遍历一次且仅遍历一次）。
    //
    // 还有一种Map，它在内部会对Key进行排序，这种Map就是SortedMap。注意到SortedMap是接口，它的实现类是TreeMap。
    //       map
    //      /   \
    // hashmap sortmap
    //     /     \
    //         treemap
    public static void main(String[] args) {
        Map<String, Integer> treeMaps = new TreeMap<>();
        treeMaps.put("c", 1);
        treeMaps.put("a", 1);
        treeMaps.put("d", 1);
        treeMaps.put("w", 1);
        System.out.println(treeMaps.toString());

        // 使用TreeMap时，放入的Key必须实现Comparable接口。
        // String、Integer这些类已经实现了Comparable接口，因此可以直接作为Key使用。作为Value的对象则没有任何要求。
        // 如果作为Key的class没有实现Comparable接口，那么，必须在创建TreeMap时同时指定一个自定义排序算法：

        Map<T, Integer> ts = new TreeMap<>(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.t.compareTo(o2.t);
            }
        });

        ts.put(new T("c"), 3);
        ts.put(new T("a"), 2);
        ts.put(new T("g"), 1);
        System.out.println(ts.toString());
    }
}

class T {
    public String t;

    public T(String t) {
        this.t = t;
    }
}
