package sjcm.foodDelivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sjcm.foodDelivery.domain.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
