package edu.nf.ch03.charge.impl;

import edu.nf.ch03.charge.Charge;
import edu.nf.ch03.charge.Product;

/**
 * @author wangl
 * @date 2020/10/12
 */
public class NormalCharge extends Charge {

    @Override
    public double charge(double money, Product product) {
        System.out.println("实收：" + product.getPrice());
        double returnVal = money - product.getPrice();
        System.out.println("找零: " + returnVal);
        return returnVal;
    }
}
