package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to11then0() {
        double expected = 0;
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when34to56then2() {
        double expected = 2.82;
        Point a = new Point(3, 4);
        Point b = new Point(5, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to26then3() {
        double expected = 3.16;
        Point a = new Point(1, 3);
        Point b = new Point(2, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}