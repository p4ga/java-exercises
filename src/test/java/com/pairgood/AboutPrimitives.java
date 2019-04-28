package com.pairgood;

import org.junit.Test;

import static com.pairgood.helper.Koan.__;
import static com.pairgood.instruction.primitives.Step.*;
import static org.junit.Assert.assertEquals;

public class AboutPrimitives {

    @Test
    public void wholeNumbersAreOfTypeInt() {
        assertEquals(ONE, getType(1), int.class);
    }

    @Test
    public void primitivesOfTypeIntHaveAnObjectTypeInteger() {
        Object number = 1;
        assertEquals(TWO, getType(number), number.getClass());
    }

    @Test
    public void wholeNumbersCanAlsoBeOfTypeLong() {
        assertEquals(getType(1L), long.class);
    }

    @Test
    public void primitivesOfTypeLongHaveAnObjectTypeLong() {
        Object number = 1L;
        assertEquals(getType(number), number.getClass());
    }

    @Test
    public void wholeNumbersCanAlsoBeOfTypeShort() {
        assertEquals(THREE, getType((short) 1), short.class);
    }

    @Test
    public void primitivesOfTypeShortHaveAnObjectTypeShort() {
        Object number = (short) 1;
        assertEquals(getType(number), number.getClass());
    }

    @Test
    public void wholeNumbersCanAlsoBeOfTypeByte() {
        assertEquals(getType((byte) 1), byte.class);
    }

    @Test
    public void primitivesOfTypeByteHaveAnObjectTypeByte() {
        Object number = (byte) 1;
        assertEquals(getType(number), number.getClass());
    }

    @Test
    public void wholeNumbersCanAlsoBeOfTypeChar() {
        assertEquals(getType((char) 1), char.class);
    }

    @Test
    public void singleCharactersAreOfTypeChar() {
        assertEquals(getType('a'), char.class);
    }

    @Test
    public void primitivesOfTypeCharHaveAnObjectTypeCharacter() {
        Object number = (char) 1;
        assertEquals(getType(number), number.getClass());
    }

    @Test
    public void decimalNumbersAreOfTypeDouble() {
        assertEquals(getType(1.0), double.class);
    }

    @Test
    public void primitivesOfTypeDoubleCanBeDeclaredWithoutTheDecimalPoint() {
        assertEquals(getType(1d), double.class);
    }

    @Test
    public void primitivesOfTypeDoubleCanBeDeclaredWithExponents() {
        assertEquals(getType(1e3), double.class);
        assertEquals(1.0e3, double.class);
        assertEquals(1E3, double.class);
    }

    @Test
    public void primitivesOfTypeDoubleHaveAnObjectTypeDouble() {
        Object number = 1.0;
        assertEquals(getType(number), number.getClass());
    }

    @Test
    public void decimalNumbersCanAlsoBeOfTypeFloat() {
        assertEquals(getType(1f), float.class);
    }

    @Test
    public void primitivesOfTypeFloatCanBeDeclaredWithExponents() {
        assertEquals(getType(1e3f), __);
        assertEquals(1.0e3f, __);
        assertEquals(1E3f, __);
    }

    @Test
    public void primitivesOfTypeFloatHaveAnObjectTypeFloat() {
        Object number = 1f;
        assertEquals(getType(number), number.getClass());
    }

    private Class<?> getType(int value) {
        return int.class;
    }

    private Class<?> getType(long value) {
        return long.class;
    }

    private Class<?> getType(float value) {
        return float.class;
    }

    private Class<?> getType(double value) {
        return double.class;
    }

    private Class<?> getType(byte value) {
        return byte.class;
    }

    private Class<?> getType(char value) {
        return char.class;
    }

    private Class<?> getType(short value) {
        return short.class;
    }

    private Class<?> getType(Object value) {
        return value.getClass();
    }

}
