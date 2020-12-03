package edu.nf.ch03.calc;

/**
 * @author wangl
 * @date 2020/10/10
 */
public class Main {

    public static void main(String[] args) {
        Calc calc = new Add();
        double result = calc.cal(1, 2);
        calc.display(result);
    }
}
