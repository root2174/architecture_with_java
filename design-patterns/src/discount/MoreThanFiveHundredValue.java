package discount;

import Budget.Budget;

import java.math.BigDecimal;

public class MoreThanFiveHundredValue extends Discount {
    public MoreThanFiveHundredValue(Discount next) {
        super(next);
    }

    public BigDecimal execute(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean shouldApplyDiscount(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
