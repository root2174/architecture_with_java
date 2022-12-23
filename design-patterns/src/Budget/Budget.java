package Budget;

import Budget.status.BudgetStatus;
import Budget.status.InAnalysis;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private final int itemQuantity;
//    STATE PATTERN
    private BudgetStatus status;

    public Budget(BigDecimal value, int itemQuantity) {
        this.value = value;
        this.itemQuantity = itemQuantity;
        this.status = new InAnalysis();
    }

    public BigDecimal getValue() {
        return this.value;
    }

    public int getItemQuantity() {
        return this.itemQuantity;
    }

    public void applyExtraDiscount() {
        BigDecimal extraDiscount = this.status.calculateExtraDiscount(this);

        this.value = this.value.subtract(extraDiscount);
    }

    public void approve() {
        this.status.approve(this);
    }

    public void reject() {
        this.status.reject(this);
    }

    public void done() {
        this.status.done(this);
    }

    public void updateStatus(BudgetStatus status) {
        this.status = status;
    }
}
