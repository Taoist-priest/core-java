package edu.nf.ch03.charge2;

/**
 * @author wangl
 * @date 2020/10/12
 * 打折收费
 */
public class DiscountCharge implements Charge {

    @Override
    public double charge(ChargeParams params) {
        System.out.println("应收：" + params.getProduct().getPrice() * params.getDiscount());
        System.out.println("实收：" + params.getMoney());
        //找零
        return params.getMoney() - params.getProduct().getPrice()
                * params.getDiscount();
    }

    @Override
    public void say() {
        System.out.println("Hello");
    }
}
