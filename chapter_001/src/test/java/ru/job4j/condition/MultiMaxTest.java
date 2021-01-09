package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(5, 1, 2);
        assertThat(result, is(5));
    }
    @Test
    public void whentherdMax() {
        int result = MultiMax.max(1, 2, 25);
        assertThat(result, is(25));
    }
    @Test
    public void whennoMax() {
        int result = MultiMax.max(2, 2, 2);
        assertThat(result, is(2));
    }
}