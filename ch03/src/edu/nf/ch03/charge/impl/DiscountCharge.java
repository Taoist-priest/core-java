package edu.nf.ch03.charge.impl;

import edu.nf.ch03.charge.Charge;
import edu.nf.ch03.charge.Product;

/**
 * @author wangl
 * @date 2020/10/12
 */
public class DiscountCharge extends Charge {

    private Double discount;

    /**
     *
     * @param discount
     */
    public DiscountCharge(Double discount){
        this.discount = discount;
    }

    @Override
    public double charge(double money, Product product) {
        double d = product.getPrice() * discount;
        System.out.println("实收: " + d);
        double returnVal = money - d;
        System.out.println("找零：" + returnVal);
        return returnVal;
    }
}
