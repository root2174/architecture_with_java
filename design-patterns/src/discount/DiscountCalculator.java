package discount;

import Budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget) {
        Discount discount = new MoreThanFiveItemsDiscount(
                new MoreThanFiveHundredValue(
                        new NoDiscount()
                )
        );

        return discount.calculate(budget);
    }
}
