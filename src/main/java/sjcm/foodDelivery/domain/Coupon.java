package sjcm.foodDelivery.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Coupon {

    @Id
    @GeneratedValue
    @Column(name = "coupon_id")
    private Long id;

    String policy;
    private int discount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id")
    private Shop shop;

    public static Coupon createCoupon(String policy, int discount, Shop shop) {
        Coupon coupon = new Coupon();
        coupon.policy = policy;
        coupon.discount = discount;
        coupon.shop = shop;
        return coupon;
    }
}
