package base;

import java.util.Arrays;


/**
 * 数组是同一数据类型的集合，数组一旦创建后，大小就不可变；
 *
 * 可以通过索引访问数组元素，但索引超出范围将报错；
 *
 * 数组元素可以是值类型（如int）或引用类型（如String），但数组本身是引用类型；
 */
public class demo6 {
    public static void main(String[] args) {
        int[] s = new int[3];
        s[0] = 1;
        s[1] = 1;
        s[2] = 1;
        System.out.println(Arrays.toString(s));// [1, 1, 1]
        String[] s1 = new String[]{"zhangsan", "lisi"};
        System.out.println(Arrays.toString(s1));
        // 使用length获取数组大小
        System.out.println(s.length);
        // 数组是引用类型，在使用索引访问数组元素时，如果索引超出范围
        // System.out.println(s[5]);// ArrayIndexOutOfBoundsException
        int[] i = {1, 2, 34};
    }
}
