package edu.nf.ch01;

/**
 * @author wangl
 * @date 2020/9/30
 */
public class Demo {

    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("world");
        String d = new String("world");

        System.out.println(a==b);
        System.out.println(c.equals(d));
    }
}
