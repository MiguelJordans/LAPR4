package eapli.base.ordermanagement.application;

import eapli.base.ordermanagement.domain.OrderLine;
import eapli.base.productmanagement.domain.Product;
import eapli.framework.general.domain.model.Money;


public class CalculateOrderLineService {


    public OrderLine calculateOrderLine(Product product, int quantity) {

        String total = String.valueOf(product.price().multiply(quantity).amount());
        return new OrderLine(product.identity(), quantity, total);
    }
}
