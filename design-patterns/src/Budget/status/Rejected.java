package Budget.status;

import Budget.Budget;

import java.math.BigDecimal;

public class Rejected extends BudgetStatus{
    @Override
    public void done(Budget budget) {
        budget.updateStatus(new Done());
    }
}
