import org.junit.Assert;
import org.junit.Test;

public class MoneyTest {
    @Test
    public void testMultiplication_given5times2_expected10_given5times3_expecteed15(){
        Dollar five = new Dollar(5);

        Dollar product = five.time(2);
        Assert.assertEquals(10, product.amount);
        product = five.time(3);
        Assert.assertEquals(15, product.amount);
    }

    private class Dollar {
        public int amount;

        public Dollar(int number) {
            amount = number;
        }

        public Dollar time(int multiplier) {
            return new Dollar(amount * multiplier);

        }
    }
}
