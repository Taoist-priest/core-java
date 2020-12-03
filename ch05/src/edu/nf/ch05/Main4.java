package edu.nf.ch05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

/**
 * @author wangl
 * @date 2020/10/14
 */
public class Main4 {

    public static void main(String[] args) throws Exception{
        //获取Users的Class对象
        Class<?> clazz = Class.forName("edu.nf.ch05.Users");
        //获取所有公共的构造方法,构造方法使用Constructor对象来描述，
        //一个Constructor表示一个构造方法
        Constructor[] cons = clazz.getConstructors();
        for(Constructor c : cons){
            //输出构造方法的名称
            System.out.println(c.getName());
            //获取构造方法的所有参数信息
            Parameter[] params = c.getParameters();
            //循环输出每一个参数的详细信息
            for(Parameter p : params){
                System.out.println("参数名称：" + p.getName());
                System.out.println("参数类型：" + p.getType());
            }
            System.out.println();
        }
        System.out.println("--------------------------");
        //获取某一个公共的构造方法
        Constructor con = clazz.getConstructor(String.class);
        //使用构造方法来创建实例，同时需要传入构造方法所需的参数
        //如果是无参的构造方法，则不需要
        Object obj = con.newInstance("user1");
        System.out.println("创建出的实例：" + obj);
        System.out.println("--------------------------");
        //获取所有的构造方法，包括私有的
        Constructor[] cons2 = clazz.getDeclaredConstructors();
        for(Constructor c : cons2){
            System.out.println(c.getName() + ", 参数个数:" + c.getParameterCount());
        }
        System.out.println("---------------------------");
        //获取某一个私有的构造方法
        Constructor c = clazz.getDeclaredConstructor(Integer.TYPE);
        System.out.println("私有构造方法：" + c.getName());
        //如果要使用私有的构造方法来创建实例，就必须先打开访问开关
        c.setAccessible(true);
        Object obj2 = c.newInstance(1);
        System.out.println("私有构造方法创建的实例：" + obj2);
    }
}
