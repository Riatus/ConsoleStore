package data.data_source.order;

import data.models.Order;


import java.util.ArrayList;

public  abstract class OrderDataSource {


   public abstract void createOrder(Order order);

   public abstract Order getOrder();

}
