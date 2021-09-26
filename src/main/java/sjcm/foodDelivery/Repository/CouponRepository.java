package sjcm.foodDelivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sjcm.foodDelivery.domain.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

}
