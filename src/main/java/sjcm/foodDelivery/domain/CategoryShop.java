package sjcm.foodDelivery.domain;

import javax.persistence.*;

@Entity
public class CategoryShop {

    @Id
    @GeneratedValue
    @Column(name = "category_food_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id")
    private Shop shop;
}
