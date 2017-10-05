package br.com.java.OO.test;

import br.com.java.OO.business.CouponManager;

/**
 * Created by Francislin Dos Reis on 04/10/17.
 */
public class DiscountContent {

    public static void main(String[] args) {

        CouponManager couponManager = new CouponManager();

        Double discout = couponManager.validCoupon("cab11");

        if (discout != null) {

            System.out.println("Discount is valid !");

            System.out.println("Value: R$: " + discout);

        } else {
            System.out.println("Discount is invalid, this coupon does not exist!");
        }
    }
}
