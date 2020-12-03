package edu.nf.ch05.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangl
 * @date 2020/10/13
 */
public class Test {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", 1001);
        map.put("name", "张三");
        map.put("age", 21);
        //编写一个BeanUtils的工具类，将map集合数据自动转换成实体类型
        Students stu = (Students) BeanUtils.convertToBean(map, Students.class);
        System.out.println(stu.getId());
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println("--------------------------------");
        //传入任意一个实体对象，转换为map对象
        Map<String, Object> map2 = BeanUtils.convertToMap(stu);
        for(String key : map2.keySet()){
            System.out.println(key + " : " + map2.get(key));
        }
        System.out.println("---------------------------------");
        //创建一个新的Students对象来拷贝
        Teacher teacher = new Teacher();
        BeanUtils.copy(stu, teacher);
        System.out.println(teacher.getId());
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
    }
}
