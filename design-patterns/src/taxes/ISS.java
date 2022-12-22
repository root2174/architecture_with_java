package taxes;

import Budget.Budget;

import java.math.BigDecimal;

public class ISS implements Tax {
    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }
}
