package Budget.status;

import Budget.Budget;
import exceptions.DomainException;

import java.math.BigDecimal;

public class Approved extends BudgetStatus{

    @Override
    public BigDecimal calculateExtraDiscount(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void done(Budget budget) {
        budget.updateStatus(new Done());
    }
}
