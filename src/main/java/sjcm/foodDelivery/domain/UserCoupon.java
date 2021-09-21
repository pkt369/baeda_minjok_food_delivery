package sjcm.foodDelivery.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class UserCoupon {

    @Id
    @GeneratedValue
    @Column(name = "user_coupon_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;
}
