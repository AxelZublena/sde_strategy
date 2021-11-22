package discount;

import com.hz.Customer;

public interface DiscountStrategy {
    double getDiscount(Customer customer, int productIndex, int productsLength);
}
