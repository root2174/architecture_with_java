package Budget.status;

import Budget.Budget;
import exceptions.DomainException;

import java.math.BigDecimal;

public abstract class BudgetStatus {

    public BigDecimal calculateExtraDiscount(Budget budget) {
       return BigDecimal.ZERO;
    }

    public void approve(Budget budget) {
        throw new DomainException("Budget cannot be approved!");
    }

    public void reject(Budget budget) {
        throw new DomainException("Budget cannot be rejected!");
    }

    public void done(Budget budget) {
        throw new DomainException("Budget cannot be rejected!");
    }
}
