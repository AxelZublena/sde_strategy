package discount;

import com.hz.Customer;

public class ChristmasDiscountStrategy implements DiscountStrategy{

    public ChristmasDiscountStrategy(){

    }

    @Override
    public double getDiscount(Customer customer, int productIndex, int productsLength){
        boolean isFirstProduct = productIndex == 0;
        if(isFirstProduct) {
            return .20;
        }
        return .125;
    }
}
