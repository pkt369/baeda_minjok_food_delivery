package sjcm.foodDelivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sjcm.foodDelivery.domain.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
