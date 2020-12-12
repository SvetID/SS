package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class CalculateTest {

    @Test
    public void plus() {
        Calculate calculate = new Calculate();
        int result = calculate.plus(3, 4);
        Assert.assertThat(result, is(7));
    }
}