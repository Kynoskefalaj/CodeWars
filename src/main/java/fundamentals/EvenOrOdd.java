package fundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        if (number % 2 != 0) {
            return "Odd";
        } else {
            return "Even";
        }
    }

    @Test
    public void testEvenOrOdd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals("Even", eoo.even_or_odd(6));
        assertEquals("Odd", eoo.even_or_odd(7));
        assertEquals("Even", eoo.even_or_odd(0));
        assertEquals("Odd", eoo.even_or_odd(-1));
    }
}
