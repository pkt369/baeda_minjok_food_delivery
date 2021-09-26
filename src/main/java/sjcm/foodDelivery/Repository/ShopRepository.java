package sjcm.foodDelivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sjcm.foodDelivery.domain.Shop;

public interface ShopRepository extends JpaRepository<Shop, Long> {

}
