package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.within;

class FitTest {

    @Test
    void whenManHeight187Then100Point05() {
        int height = 187;
        double result = Fit.idealWeight(height, true);
        assertThat(result).isCloseTo(100.05, within(0.01));
    }

    @Test
    void whenWomanHeight170Then69() {
        int height = 170;
        double result = Fit.idealWeight(height, false);
        assertThat(result).isCloseTo(69.0, within(0.01));
    }

    @Test
    void whenManHeight160Then69() {
        int height = 160;
        double result = Fit.idealWeight(height, true);
        assertThat(result).isCloseTo(69.0, within(0.01));
    }

    @Test
    void whenWomanHeight150Then46() {
        int height = 150;
        double result = Fit.idealWeight(height, false);
        assertThat(result).isCloseTo(46.0, within(0.01));
    }
}