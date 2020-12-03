package edu.nf.ch03.teacher;

/**
 * @author wangl
 * @date 2020/10/12
 */
public class Main {

    public static void main(String[] args) {
        Teacher2 teacher = new JavaTeacher();
        teacher.call();
        teacher.lesson();
        teacher.homework();
    }
}
