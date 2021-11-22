package com.hz;
import discount.DiscountStrategy;
import products.Product;

import java.util.ArrayList;

public class ShoppingCart extends ArrayList<Product> {

    Customer customer;

    public ShoppingCart(Customer customer){
        this.customer = customer;
    }

    public double getTotalPrice(DiscountStrategy discountStrategy) {

        double totalPrice = 0.0;

        int productsLength = this.size();

        for(Product product : this) {

            int index = this.indexOf(product);

            double discount = discountStrategy.getDiscount(this.customer, index, productsLength);
            double price = product.getPrice() * (1 - discount);

            totalPrice += price;
        }

        return totalPrice;
    }
}