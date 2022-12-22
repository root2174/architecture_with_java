package taxes;

import Budget.Budget;

import java.math.BigDecimal;

public class TaxesCalculator {
    public BigDecimal calculate(Budget budget, Tax tax) {
        return tax.calculate(budget);
    }
}
