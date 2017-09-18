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

    }

        @Test
        public void equalityTest(){
            assertTrue(new Dollar(5).equals(new Dollar(5)));
            assertFalse(new Dollar(5).equals(new Dollar(6)));
        }




    private class Dollar {
        private int amount;

        public Dollar(int number) {
            amount = number;
        }

        public Dollar times(int multiplier) {
            return new Dollar(amount * multiplier);

        }

        @Override
        public boolean equals(Object o) {
            Dollar dollar = (Dollar) o;
            return amount == dollar.amount;
        }
    }
}
