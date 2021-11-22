package discount;

import com.hz.Customer;

public class BaseDiscountStrategy implements DiscountStrategy{

    @Override
    public double getDiscount(Customer customer, int productIndex, int productsLength){
        if(customer.isRegular()) {
            return .15;
        }
        return 0;
    }
}
