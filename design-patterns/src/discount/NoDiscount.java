package discount;

import Budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {
    public NoDiscount() {
        super(null);
    }

    public BigDecimal execute(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean shouldApplyDiscount(Budget budget) {
        return true;
    }
}
