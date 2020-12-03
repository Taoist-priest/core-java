package edu.nf.ch03.charge;

import edu.nf.ch03.charge.impl.DiscountCharge;

/**
 * @author wangl
 * @date 2020/10/10
 */
public class Main {

    public static void main(String[] args) throws Exception{
        Product product = new Product();
        product.setName("apple");
        product.setPrice(4.5);

        Charge charge = new DiscountCharge(0.8);
        charge.charge(100, product);


    }
}
