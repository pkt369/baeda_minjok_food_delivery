package sjcm.foodDelivery.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Food {

    @Id
    @GeneratedValue
    @Column(name = "food_id")
    private Long id;

    String name;
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id")
    private Shop shop;
}
