package eapli.base.ordermanagement.domain;


import eapli.framework.domain.model.ValueObject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class OrderLine implements ValueObject, Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int quantity;
    private String price;

    public Long productId() {
        return productId;
    }

    private Long productId;

    protected OrderLine() {
    }


    public OrderLine(Long productId, int quantity, String price) {

        this.productId = productId;
        this.quantity = quantity;
        this.price = price;

    }

    public static OrderLine valueof(final Long productId, final int quantity, final String price) {
        return new OrderLine(productId, quantity, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderLine orderLine = (OrderLine) o;
        return quantity == orderLine.quantity && Objects.equals(productId, orderLine.productId) && Objects.equals(price, orderLine.price);
    }

    public String price() {
        return this.price;
    }

    @Override
    public String toString() {
        return "\n\t OrderLine -> [" +
                ", ProductQuantity : " + quantity +
                ", TotalPrice : " + price +
                " €, ProductId : " + productId + "]";

    }
}
