package edu.nf.ch05.homework;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangl
 * @date 2020/10/13
 */
public class BeanUtils {

    /**
     * 将map转换成实体
     * @param map
     * @param clazz
     * @return
     */
    public static Object convertToBean(Map<String, Object> map, Class<?> clazz) {
        try {
            //根据class对象创建当前类的实例
            Object obj = clazz.newInstance();
            //循环遍历map集合，取出每一个key
            for (String key : map.keySet()) {
                //只要key和实体的字段名相匹配，就可以取出对应的Field对象
                Field field = clazz.getDeclaredField(key);
                //打开访问开关，给field赋值
                field.setAccessible(true);
                //赋值,中map集合中根据key取出value，然后赋值给Field
                Object value = map.get(key);
                field.set(obj, value);
            }
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将实体转换成map
     * @param obj
     * @return
     */
    public static Map<String, Object> convertToMap(Object obj){
        Map<String, Object> map = new HashMap<>();
        //根据实例获取Class对象
        Class<?> clazz = obj.getClass();
        //获取所有的私有字段
        Field[] fields = clazz.getDeclaredFields();
        //循环遍历每一个字段信息
        for(Field field : fields){
            //取出每一个filed的值
            try {
                //打开访问开关
                field.setAccessible(true);
                Object value = field.get(obj);
                //将field的name作为key，字段值作为value保存到map中
                map.put(field.getName(), value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    /**
     * Bean的拷贝
     * 把src实体对象的字段信息拷贝到target实体对象的字段中
     */
    public static void copy(Object src, Object target) {
        //获取源实例的Class对象
        Class<?> srcClass = src.getClass();
        //获取目标实例的Class对象
        Class<?> targetClass = target.getClass();
        //再获取源对象中的所有字段信息
        Field[] fields = srcClass.getDeclaredFields();
        for(Field field : fields){
            try {
                //打开访问开关
                field.setAccessible(true);
                //获取源对象Field的值
                Object value = field.get(src);
                //根据src的字段名去获取目标对象同名的Field
                Field targetField = targetClass.getDeclaredField(field.getName());
                //打开访问开关
                targetField.setAccessible(true);
                //给目标的Field设值
                targetField.set(target, value);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
