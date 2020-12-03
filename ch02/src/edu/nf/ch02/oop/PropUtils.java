package edu.nf.ch02.oop;

import java.io.IOException;
import java.util.Properties;

/**
 * @author wangl
 * @date 2020/10/9
 * 解析Properties文件
 */
public class PropUtils {

    public static String getProperty(String key){
        Properties prop = new Properties();
        //加载properties资源文件
        try {
            prop.load(Main.class.getClassLoader().getResourceAsStream("class.properties"));
            //根据key取出value
            String className = prop.getProperty(key);
            return className;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("解析异常", e);
        }
    }
}
