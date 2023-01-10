package data.data_source.cart;

import data.models.CartItem;
import data.models.Product;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class CartDataSource {


    public abstract void addToCart(Product product, int count);
    public abstract ArrayList<CartItem> getToCart();

}
