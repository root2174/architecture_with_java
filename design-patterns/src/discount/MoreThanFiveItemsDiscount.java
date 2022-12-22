package discount;

import Budget.Budget;

import java.math.BigDecimal;

public class MoreThanFiveItemsDiscount extends Discount {

    public MoreThanFiveItemsDiscount(Discount next) {
        super(next);
    }

    public BigDecimal execute(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean shouldApplyDiscount(Budget budget) {
        return budget.getItemQuantity() > 5;
    }
}
