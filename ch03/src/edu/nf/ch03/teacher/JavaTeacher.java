package edu.nf.ch03.teacher;

/**
 * @author wangl
 * @date 2020/10/12
 */
public class JavaTeacher implements Teacher2 {

    @Override
    public void lesson() {
        System.out.println("上Java课程");
    }

    @Override
    public void homework() {
        System.out.println("布置Java作业");
    }

    /**
     *  重写了父类的code方法
     */
    @Override
    public void code() {
        System.out.println("开发Java项目");
    }
}
