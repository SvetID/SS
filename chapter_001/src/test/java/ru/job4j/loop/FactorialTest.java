package ru.job4j.loop;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void fact3() {
        int rsl = Factorial.calc(3);
        int expected = 6;
        assertThat(rsl, Matchers.is(expected));
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }  @Test
    public void fact5() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, Matchers.is(expected));
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }

    @Test
    public void fact6() {
        int rsl = Factorial.calc(6);
        int expected = 720;
        assertThat(rsl, Matchers.is(expected));
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }

    @Test
    public void fact0() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, Matchers.is(expected));
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
    }
}