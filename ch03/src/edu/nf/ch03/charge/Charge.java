package edu.nf.ch03.charge;

/**
 * @author wangl
 * @date 2020/10/10
 * 抽象的收费类，由子类实现不同的收费方式
 */
public abstract class Charge {

    public abstract double charge(double money, Product product);

}
