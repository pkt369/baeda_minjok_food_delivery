package sjcm.foodDelivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sjcm.foodDelivery.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
