package Budget;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private final int itemQuantity;
    private String state;

    public Budget(BigDecimal value, int itemQuantity) {
        this.value = value;
        this.itemQuantity = itemQuantity;
    }

    public BigDecimal getValue() {
        return this.value;
    }

    public int getItemQuantity() {
        return this.itemQuantity;
    }

    public void applyExtraDiscount() {
        BigDecimal extraDiscount = BigDecimal.ZERO;
        if (state.equals("IN_ANALYSIS")) {
            extraDiscount = new BigDecimal("0.05").multiply(this.value);
        } else if(state.equals("APPROVED")) {
            extraDiscount = new BigDecimal("0.02").multiply(this.value);
        }
        this.value = this.value.subtract(extraDiscount);
    }
}
