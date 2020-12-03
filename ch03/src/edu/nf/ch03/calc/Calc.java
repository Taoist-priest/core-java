package edu.nf.ch03.calc;

/**
 * @author wangl
 * @date 2020/10/10
 * 抽象的计算器，包含一个抽象的计算方法
 */
public abstract class Calc {

    /**
     * 计算方法有不同的实现
     * @return
     */
    public abstract double cal(double a, double b);

    /**
     * 公共的显示输出方法，将计算结果显示到控制台
     */
    public void display(double result){
        System.out.println("结果：" + result);
    }
}
