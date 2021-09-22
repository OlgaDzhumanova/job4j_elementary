package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int result = 120;
        int expected = Factorial.calc(n);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
       int n = 0;
       int result = 1;
       int expected = Factorial.calc(n);
       Assert.assertEquals(expected, result);
    }
}