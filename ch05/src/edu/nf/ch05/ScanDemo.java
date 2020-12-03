package edu.nf.ch05;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @author wangl
 * @date 2020/10/14
 */
public class ScanDemo {
    public static void main(String[] args) throws Exception{
        List<String> classNames = ScanUtils.scanPackage();
        for(String className : classNames){
            Class<?> clazz = Class.forName(className);
            Method[] methods = clazz.getMethods();

        }
    }
}
