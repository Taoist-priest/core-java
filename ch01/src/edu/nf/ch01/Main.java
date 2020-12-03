package edu.nf.ch01;

/**
 * @author wangl
 * @date 2020/9/30
 * 对象的初始化流程：
 * 1. 进行类加载
 * 2. 初始化静态成员
 * 3. 在堆内存中分配空间创建对象
 * 4. 初始化实例变量
 * 5. 执行构造方法剩余的内容
 *
 */
public class Main {

    public static void main(String[] args) {
        People p1 = new People();
        //People p2 = new People();

        //People.address = "";
        //p1.address = "bbb";
        //System.out.println(p2.address);
        /*People p2 = p1;
        People p3 = new People();
        p1 = null;
        p3 = p1;
        p2.say();*/
    }
}
