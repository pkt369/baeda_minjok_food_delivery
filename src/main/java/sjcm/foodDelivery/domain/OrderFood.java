package sjcm.foodDelivery.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderFood {

    @Id
    @GeneratedValue
    @Column(name = "order_food_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_id")
    private Food food;

    private int count;
    private int orderPrice;

    public OrderFood(Order order, Food food, int count, int orderPrice) {
        this.order = order;
        this.food = food;
        this.count = count;
        this.orderPrice = orderPrice;
    }
}
