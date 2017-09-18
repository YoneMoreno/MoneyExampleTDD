import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MoneyTest {
    @Test
    public void testMultiplication_given5times2_expected10_given5times3_expecteed15() {
        Dollar five = new Dollar(5);

        Dollar product = five.time(2);
        assertEquals(10, product.amount);
        product = five.time(3);
        assertEquals(15, product.amount);

    }

        @Test
        public void equalityTest(){
            assertTrue(new Dollar(5).equals(new Dollar(5)));
            assertFalse(new Dollar(5).equals(new Dollar(6)));
        }




    private class Dollar {
        public int amount;

        public Dollar(int number) {
            amount = number;
        }

        public Dollar time(int multiplier) {
            return new Dollar(amount * multiplier);

        }

        @Override
        public boolean equals(Object o) {
            Dollar dollar = (Dollar) o;
            return amount == dollar.amount;
        }
    }
}
