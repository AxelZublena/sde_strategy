package com.hz;

import discount.BlackFridayDiscountStrategy;
import discount.ChristmasDiscountStrategy;
import discount.DiscountStrategy;
import discount.BaseDiscountStrategy;

public class Checkout {

    private SalesAction salesAction;
    private DiscountStrategy strategy;

    public void setDiscountStrategy(DiscountStrategy strategy){
        this.strategy = strategy;
    }

    public Checkout(SalesAction action) {
        this.salesAction = action;

    }

    public void nextInLine(Customer customer) {

        // init checkout
        if(salesAction == SalesAction.ChristmasEve) {
            this.strategy = new ChristmasDiscountStrategy();
        }
        else if(salesAction == SalesAction.BlackFriday) {
            this.strategy = new BlackFridayDiscountStrategy();
        }
        else {
            this.strategy = new BaseDiscountStrategy();
        }

        // Welcome customer
        String welcome = String.format("Hello %s, would you pass me your shopping cart?",
                customer.getName());
        Console.write(welcome);

        // perform checkout
        ShoppingCart cart = customer.getCart();

        double amountToPay = cart.getTotalPrice(this.strategy);
        String payinfo = String.format("Let's see, that will be.. %.02f. Cash or card?", amountToPay);
        Console.write(payinfo);
    }
}
