package discount;

import Budget.Budget;

import java.math.BigDecimal;

// Chain of Responsibility + Template Method
public abstract class Discount {
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public BigDecimal calculate(Budget budget) {
        if(shouldApplyDiscount(budget)) {
            return execute(budget);
        } else {
            return next.calculate(budget);
        }
    }
    protected abstract BigDecimal execute(Budget budget);
    protected abstract boolean shouldApplyDiscount(Budget budget);
}
