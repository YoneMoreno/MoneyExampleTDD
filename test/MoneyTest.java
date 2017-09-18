import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MoneyTest {
    @Test
    public void testMultiplication_given5timess2_expected10_given5timess3_expecteed15() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10).amount, five.times(2).amount);
        assertEquals(new Dollar(15).amount, five.times(3).amount);

    }    @Test
    public void testFrancMultiplication_given5timess2_expected10_given5timess3_expecteed15() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10).amount, five.times(2).amount);
        assertEquals(new Franc(15).amount, five.times(3).amount);

    }

        @Test
        public void equalityTest(){
            assertTrue(new Dollar(5).equals(new Dollar(5)));
            assertFalse(new Dollar(5).equals(new Dollar(6)));
            assertTrue(new Franc(5).equals(new Franc(5)));
            assertFalse(new Franc(5).equals(new Franc(6)));
        }


//
    class Money{
        protected int amount;

        @Override
        public boolean equals(Object o) {
            Money money = (Money) o;
            return amount == money.amount;
        }
    }


    private class Dollar extends Money {


        public Dollar(int number) {
            amount = number;
        }

        public Dollar times(int multiplier) {
            return new Dollar(amount * multiplier);

        }


    }

    private class Franc extends Money {


        public Franc(int number) {
            amount = number;
        }

        public Franc times(int multiplier) {
            return new Franc(amount * multiplier);

        }


    }
}
