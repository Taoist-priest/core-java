package edu.nf.ch03.charge.impl;

import edu.nf.ch03.charge.Charge;
import edu.nf.ch03.charge.Product;

/**
 * @author wangl
 * @date 2020/10/12
 */
public class RebateCharge extends Charge {

    /**
     * 满利条件
     */
    private Double moneyCondition;

    /**
     * 返利金额
     */
    private Double returnMoney;

    public RebateCharge(Double moneyCondition, Double returnMoney){
        this.moneyCondition = moneyCondition;
        this.returnMoney = returnMoney;
    }

    @Override
    public double charge(double money, Product product) {
        Double d = product.getPrice();
        if(product.getPrice() >= moneyCondition){
            d = product.getPrice() - returnMoney;
            System.out.println("实收："  + d);
        }
        System.out.println("找零：" + (money - d));
        return money - d;
    }
}
