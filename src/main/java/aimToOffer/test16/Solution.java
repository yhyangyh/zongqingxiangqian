package aimToOffer.test16;

/**
 * Created by yyh on 2020/6/23 上午11:06
 * 注意点：指数为0，为负的情况；基数为0的情况
 */
public class Solution {

    public double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (base == 0) {
            return 0;
        }

        int flag = 1;
        if (exponent < 0) {
            flag = -1;
            exponent = -1 * exponent;
        }

        double result = 1.0;
        while (exponent > 0) {
            result = result * base;
            exponent--;
        }

        return flag < 0 ? 1/result : result;
    }
}
