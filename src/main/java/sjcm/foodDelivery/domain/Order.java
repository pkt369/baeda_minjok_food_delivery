package sjcm.foodDelivery.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @Embedded
    private Address address;

    private int price;
    private int discountPrice;

    //-------------------- set ------------------
    public static Order createOrder(Address address) {
        Order order = new Order();
        order.orderDate = LocalDateTime.now();
        order.orderStatus = OrderStatus.ORDER;
        order.address = address;

        return order;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
