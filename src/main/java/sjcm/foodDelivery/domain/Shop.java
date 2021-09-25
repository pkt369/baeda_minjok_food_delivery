package sjcm.foodDelivery.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Shop {

    @Id @GeneratedValue
    @Column(name = "shop_id")
    private Long id;

    private String name;
    private String image;
}
