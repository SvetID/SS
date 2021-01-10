package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
        @Test
        public void whenSumEvenNumbersFromZeroToOneThenZero() {
            int rsl = Counter.sumByEven(0, 1);
            int expected = 0;
            assertThat(rsl, is(expected));
        }

            @Test
            public void whenSumEvenNumbersFromThreeToEightThenTwenty() {
                int rsl = Counter.sumByEven(3, 8);
                int expected = 20;
                assertThat(rsl, is(expected));
    }
}