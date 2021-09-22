package ru.job4j.loop;

import org.junit.Test;

import org.junit.Assert;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromFourToFourteenThenFiftyFour() {
        int start = 4;
        int finish = 14;
        int result = Counter.sumByEven(start, finish);
        int expected = 54;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromThreeToElevenThenTwentyEight() {
        int start = 3;
        int finish = 11;
        int result = Counter.sumByEven(start, finish);
        int expected = 28;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromTwoToTwentyThenOneHundredTen() {
        int start = 2;
        int finish = 20;
        int result = Counter.sumByEven(start, finish);
        int expected = 110;
        Assert.assertEquals(expected, result);
    }
}