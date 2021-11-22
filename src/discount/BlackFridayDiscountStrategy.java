package discount;

import com.hz.Customer;

public class BlackFridayDiscountStrategy implements DiscountStrategy{

    @Override
    public double getDiscount(Customer customer, int productIndex, int productsLength){
        if(productsLength < 80.0){
            return productsLength/100.0;
        }
        return .80;
    }
}
