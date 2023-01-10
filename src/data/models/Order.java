package data.models;

import java.util.ArrayList;


public class Order {
  public final String name;
   public final String phone;
   public final String address;
   public final String paymentTime;
   public final String deliveryTime;
   public final ArrayList<CartItem> cart;


   public Order(String name, String phone, String address, String paymentTime, String deliveryTime, ArrayList<CartItem> cart) {
      this.name = name;
      this.phone = phone;
      this.address = address;
      this.paymentTime = paymentTime;
      this.deliveryTime = deliveryTime;
      this.cart = cart;
   }
}
