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
        assertEquals(ONE, value, "0 1 2 3 4 ");
    }

    @Test
    public void basicForLoop2() {
        String value = "";
        for (int i = -5; i < 1; i++) {
            value += i + " ";
        }
        assertEquals(ONE, value, "-5 -4 -3 -2 -1 0 ");
    }

    @Test
    public void basicForLoop3() {
        String value = "";
        for (int i = 5; i > 0; i--) {
            value += i + " ";
        }
        assertEquals(ONE, value, "5 4 3 2 1 ");
    }

    @Test
    public void basicForLoop4() {
        String value = "";
        for (int i = 0; i < 11; i += 2) {
            value += i + " ";
        }
        assertEquals(ONE, value, "0 2 4 6 8 10 ");
    }

    @Test
    public void basicForLoop5() {
        String value = "";
        for (int i = 1; i <= 16; i *= 2) {
            value += i + " ";
        }
        assertEquals(ONE, value, "1 2 4 8 16 ");
    }

    @Test
    public void basicForLoopWithTwoVariables1() {
        String value = "";
        for (int i = 0, j = 10; i < 5 && j > 5; i++, j--) {
            value += i + " " + j + " ";
        }
        assertEquals(ONE, value, "0 10 1 9 2 8 3 7 4 6 ");
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
        assertEquals(ONE, value, "(0, 0) (0, 1) (0, 2)  - (1, 0) (1, 1) (1, 2)  - (2, 0) (2, 1) (2, 2)  - ");
    }

    @Test
    public void extendedForLoop() {
        int[] is = {1, 2, 3, 4};
        String value = "";
        for (int j : is) {
            value += j + " ";
        }
        assertEquals(ONE, value, "1 2 3 4 ");
    }

    @Test
    public void whileLoop() {
        int result = 0;
        while (result < 3) {
            result++;
        }
        assertEquals(ONE, result, 3);
    }

    @Test
    public void doLoop() {
        int result = 0;
        do {
            result++;
        } while (false);
        assertEquals(ONE, result, 1);
    }
}
