package edu.nf.ch03.abs;

/**
 * @author wangl
 * @date 2020/10/10
 */
public class Main {

    public static void main(String[] args) {
        Teacher teacher = new PhpTeacher();
        teacher.call();
        teacher.lesson();
        teacher.homework();
    }
}

