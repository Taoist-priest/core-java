package edu.nf.ch07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author wangl
 * @date 2020/10/20
 */
public class TestCollection {

    /**
     * ArrayList是基于数组的结构实现的
     */
    public void testArrayList(){
        ArrayList<String> list = new ArrayList<>();
        //添加元素,允许重复元素
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("python");
        list.add("hello");
        //根据下标取出指定的元素
        String str = list.get(1);
        System.out.println(str);
        System.out.println("-----------------");
        //遍历集合
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("-----------------");
        //替换指定下标的元素
        list.set(4, "wowo");
        System.out.println(list.get(4));
        System.out.println("-----------------");
        //删除元素
        list.remove(4);
        System.out.println("集合大小：" + list.size());
        System.out.println("-----------------");
        //判断某个元素是否存在集合中
        boolean bl = list.contains("hello");
        System.out.println("是否包含元素：" + bl);
        System.out.println("-----------------");
        //获取元素的下标值
        int index = list.indexOf("hello");
        System.out.println("元素下标：" + index);
        //判断集合是否为空
        System.out.println(list.isEmpty());
    }

    /**
     * LinkedList集合是基于链表的数据结构实现的
     */
    public void testLinkedList(){
        LinkedList<String> list = new LinkedList<>();
        //添加元素
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("php");
        //根据下标获取元素
        list.get(0);
        list.set(0, "good");
        list.remove(0);
        //...与ArrayList类似，有有实现List接口中的方法

        //LinkedList独有的api方法，可以在集合的头和尾来操作元素
        //从头部添加元素
        list.addFirst("hello");
        //从尾部添加元素
        list.addLast("python");
        //移除头和尾的元素
        list.removeFirst();
        list.removeLast();
    }

    /**
     * Hashset是基于散列的数据结构
     * HashSet是无下标，无序，不可重复的一种集合
     */
    public void testHashSet(){
        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("java");
        set.add("world");
        set.add("php");
        set.add("hello");
        //遍历循环
//        for(String s : set){
//            System.out.println(s);
//        }
        set.forEach(s -> System.out.println(s));
        System.out.println("--------------");
        //判断集合是否为空
        System.out.println(set.isEmpty());
        //判断set集合是否包含元素
        System.out.println(set.contains("hello"));
    }

    public void testHashset2(){
        HashSet<Users> set = new HashSet<>();
        Users u1 = new Users("张三", 21);
        Users u2 = new Users("张三", 21);
        set.add(u1);
        set.add(u2);
        System.out.println(set.size());
        System.out.println(u1.equals(u2));
    }

    public static void main(String[] args) {
        TestCollection test = new TestCollection();
        //test.testArrayList();
        //test.testHashSet();
        test.testHashset2();
    }
}
