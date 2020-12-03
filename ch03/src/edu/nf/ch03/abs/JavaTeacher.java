package edu.nf.ch03.abs;

/**
 * @author wangl
 * @date 2020/10/10
 */
public class JavaTeacher extends Teacher{

    @Override
    public void lesson() {
        System.out.println("开始上Java课程");
    }

    @Override
    public void homework() {
        System.out.println("布置Java作业");
    }
}
