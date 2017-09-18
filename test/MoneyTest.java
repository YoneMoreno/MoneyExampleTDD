import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MoneyTest {
    @Test
    public void testMultiplication_given5timess2_expected10_given5timess3_expecteed15() {
        Money five = Money.dollar(5);
        assertEquals( Money.dollar(10).amount, five.times(2).amount);
        assertEquals(Money.dollar(15).amount, five.times(3).amount);

    }    @Test
    public void testFrancMultiplication_given5timess2_expected10_given5timess3_expecteed15() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10).amount, five.times(2).amount);
        assertEquals(Money.franc(15).amount, five.times(3).amount);

    }

        @Test
    public void equalityTest(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));

    }


//
abstract static class Money{
        protected int amount;

        abstract Money times(int multiplier);

        @Override
        public boolean equals(Object o) {
            Money money = (Money) o;
            return amount == money.amount && getClass().equals(money.getClass());
        }

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }
}


    private static class Dollar extends Money {


        public Dollar(int number) {
            amount = number;
        }

        public Money times(int multiplier) {
            return new Dollar(amount * multiplier);

        }


    }

    private static class Franc extends Money {


        public Franc(int number) {
            amount = number;
        }

        public Money times(int multiplier) {
            return new Franc(amount * multiplier);

        }


    }
}
