package data.data_source.order;

import data.models.Order;

public class MockOrderDataSourceImp extends OrderDataSource {
    private Order order;

    @Override
   public void createOrder(Order order) {
    this.order = order;
    }

    @Override
   public Order getOrder() {
        return order;
    }
}
