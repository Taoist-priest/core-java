package edu.nf.ch03.charge2;

/**
 * @author wangl
 * @date 2020/10/12
 * 正常收费
 */
public class NormalCharge implements Charge{

    @Override
    public double charge(ChargeParams params) {
        System.out.println("应收：" + params.getProduct().getPrice());
        System.out.println("实收：" + params.getMoney());
        //找零
        return params.getMoney() - params.getProduct().getPrice();
    }

    @Override
    public void say() {
        System.out.println("Hello");
    }
}
