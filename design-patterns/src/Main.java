import Budget.Budget;
import discount.DiscountCalculator;
import taxes.ISS;
import taxes.TaxesCalculator;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"), 1);
        TaxesCalculator calculator = new TaxesCalculator();
        System.out.println(calculator.calculate(budget, new ISS()));

        Budget budget2 = new Budget(new BigDecimal("100"), 6);
        DiscountCalculator discountCalculator = new DiscountCalculator();
        System.out.println(discountCalculator.calculate(budget2));

        Budget budget3 = new Budget(new BigDecimal("1000"), 1);
        System.out.println(discountCalculator.calculate(budget3));
    }
}