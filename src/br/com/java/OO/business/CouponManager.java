package br.com.java.OO.business;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Francislin Dos Reis on 04/10/17.
 */
public class CouponManager {

    private Map<String, Double> coupons;

    public Double validCoupon(String coupon) {

        this.coupons = new HashMap<>();

        coupons.put("cab11", 13.0);
        coupons.put("cab12", 14.0);
        coupons.put("cab13", 15.0);
        coupons.put("cab14", 16.0);

        return this.coupons.get(coupon);
    }
}