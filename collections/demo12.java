package collections;

// queue - 队列
// 队列（Queue）是一种经常使用的集合。
// Queue实际上是实现了一个先进先出（FIFO：First In First Out）的有序表。
// 1 把元素添加到队列末尾；
// 2 从队列头部取出元素。

import java.util.*;

/**
 * 	错误              throw Exception	    返回false或null
 *  添加元素到队尾	        add(E e)	        boolean offer(E e)
 *  取队首元素并删除	    E remove()	        E poll()
 *  取队首元素但不删除	    E element()	        E peek()
 */
public class demo12 {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        Queue<String> q = new LinkedList<>(a);
        q.add("4");
        System.out.println(q.toString());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
