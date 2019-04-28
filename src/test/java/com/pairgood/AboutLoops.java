package com.pairgood;

import org.junit.Test;

import static com.pairgood.helper.Koan.__;
import static com.pairgood.instruction.loops.Step.ONE;
import static org.junit.Assert.assertEquals;

public class AboutLoops {

    @Test
    public void basicForLoop1() {
        String value = "";
        for (int i = 0; i < 5; i++) {
            value += i + " ";
        }
        assertEquals(ONE, value, __);
    }

    @Test
    public void basicForLoop2() {
        String value = "";
        for (int i = -5; i < 1; i++) {
            value += i + " ";
        }
        assertEquals(ONE, value, __);
    }

    @Test
    public void basicForLoop3() {
        String value = "";
        for (int i = 5; i > 0; i--) {
            value += i + " ";
        }
        assertEquals(ONE, value, __);
    }

    @Test
    public void basicForLoop4() {
        String value = "";
        for (int i = 0; i < 11; i += 2) {
            value += i + " ";
        }
        assertEquals(ONE, value, __);
    }

    @Test
    public void basicForLoop5() {
        String value = "";
        for (int i = 1; i <= 16; i *= 2) {
            value += i + " ";
        }
        assertEquals(ONE, value, __);
    }

    @Test
    public void basicForLoopWithTwoVariables1() {
        String value = "";
        for (int i = 0, j = 10; i < 5 && j > 5; i++, j--) {
            value += i + " " + j + " ";
        }
        assertEquals(ONE, value, __);
    }

    @Test
    public void nestedLoops() {
        String value = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                value += "(" + i + ", " + j + ") ";
            }
            value += " - ";
        }
        assertEquals(ONE, value, __);
    }

    @Test
    public void extendedForLoop() {
        int[] is = {1, 2, 3, 4};
        String value = "";
        for (int j : is) {
            value += j + " ";
        }
        assertEquals(ONE, value, __);
    }

    @Test
    public void whileLoop() {
        int result = 0;
        while (result < 3) {
            result++;
        }
        assertEquals(ONE, result, __);
    }

    @Test
    public void doLoop() {
        int result = 0;
        do {
            result++;
        } while (false);
        assertEquals(ONE, result, __);
    }
}
