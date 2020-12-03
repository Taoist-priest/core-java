package edu.nf.ch06;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author wangl
 * @date 2020/10/14
 */
public class Main {

    public static void main(String[] args) throws Exception{
        //获取Users的Class对象
        Class<?> clazz = Users.class;
        //获取类上标识的注解信息
        //isAnnotationPresent方法用于判断是否标识了注解
        //如果标识则返回true
        if(clazz.isAnnotationPresent(MyAnno.class)){
            //获取所有注解类
            //Annotation[] annos = clazz.getAnnotations();
            //获取指定的注解信息
            MyAnno anno= clazz.getAnnotation(MyAnno.class);
            //获取注解的属性值
            String value = anno.value();
            String name = anno.name();
            System.out.println(name + ", " + value);
        }
        System.out.println("--------------------------------");
        //获取方法上的注解信息
        Method method = clazz.getMethod("say", String.class);
        if(method.isAnnotationPresent(MyAnno.class)){
            MyAnno anno = method.getAnnotation(MyAnno.class);
            System.out.println(anno.name() + ", " + anno.value());
        }

        System.out.println("--------------------------------");
        //获取字段上的注解信息
        Field field = clazz.getDeclaredField("name");
        if(field.isAnnotationPresent(MyAnno.class)){
            MyAnno anno = field.getAnnotation(MyAnno.class);
            System.out.println(anno.name() + ", " + anno.value());
        }
    }
}
