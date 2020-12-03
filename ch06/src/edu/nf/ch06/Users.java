package edu.nf.ch06;

/**
 * @author wangl
 * @date 2020/10/14
 */
@MyAnno(value="abc", name="aaa")
public class Users {

    @MyAnno(value="efg", name="ccc")
    private String name;

    @MyAnno(value="bcd", name="bbb")
    public void say(@MyAnno(value="ggg", name="ddd") String name){
        System.out.println("Hello " + name);
    }
}
