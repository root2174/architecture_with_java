package taxes;

import Budget.Budget;

import java.math.BigDecimal;

// Strategy
public interface Tax {
    public BigDecimal calculate(Budget value);
}
