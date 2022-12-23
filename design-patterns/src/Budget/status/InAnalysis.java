package Budget.status;

import Budget.Budget;

import java.math.BigDecimal;

public class InAnalysis extends BudgetStatus {

    @Override
    public BigDecimal calculateExtraDiscount(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void approve(Budget budget) {
        budget.updateStatus(new Approved());
    }

    @Override
    public void reject(Budget budget) {
        budget.updateStatus(new Rejected());
    }
}
