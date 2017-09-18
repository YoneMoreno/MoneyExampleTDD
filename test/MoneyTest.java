import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MoneyTest {
    @Test
    public void testMultiplication_given5times2_expected10_given5times3_expecteed15() {
        Money five = Money.dollar(5);
        assertEquals( Money.dollar(10).amount, five.times(2).amount);
        assertEquals(Money.dollar(15).amount, five.times(3).amount);

    }

        @Test
    public void equalityTest(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));

    }

    @Test
    public void currencyTest(){
        assertEquals("USD",Money.dollar(1).currency());
        assertEquals("CHF",Money.franc(1).currency());
    }






static class Money{
        protected int amount;
    protected String currency;

    Money times(int multiplier){
        return new Money(amount*multiplier,currency);
    }

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
        public boolean equals(Object o) {
            Money money = (Money) o;
            return amount == money.amount && currency().equals(money.currency());
        }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount,"CHF");
    }

    String currency(){
            return currency;
    }

    public String toString(){
        return amount + " " + currency;
    }
}

}
