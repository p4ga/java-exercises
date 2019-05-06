package com.pairgood;

import org.junit.Test;

import java.text.MessageFormat;

import static com.pairgood.helper.Koan.__;
import static com.pairgood.instruction.strings.Step.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AboutStrings {

    @Test
    public void implicitStrings() {
        assertEquals(ONE, "just a plain ole string".getClass(), __);
    }

    @Test
    public void newString() {
        // very rarely if ever should Strings be created via new String() in
        // practice - generally it is redundant, and done repetitively can be slow
        String string = new String();
        String empty = "";
        assertEquals(ONE, string.equals(empty), __);
    }

    @Test
    public void newStringIsRedundant() {
        String stringInstance = "zero";
        String stringReference = new String(stringInstance);
        assertEquals(ONE, stringInstance.equals(stringReference), __);
    }

    @Test
    public void newStringIsNotIdentical() {
        String stringInstance = "zero";
        String stringReference = new String(stringInstance);
        assertEquals(ONE, stringInstance == stringReference, __);
    }

    @Test
    public void stringIsEmpty() {
        assertEquals(ONE, "".isEmpty(), __);
        assertEquals(ONE, "one".isEmpty(), __);
        assertEquals(ONE, new String().isEmpty(), __);
        assertEquals(ONE, new String("").isEmpty(), __);
        assertEquals(ONE, new String("one").isEmpty(), __);
    }

    @Test
    public void stringLength() {
        assertEquals(ONE, "".length(), __);
        assertEquals(ONE, "one".length(), __);
        assertEquals(ONE, "the number is one".length(), __);
    }

    @Test
    public void stringTrim() {
        assertEquals(ONE, "".trim(), __);
        assertEquals(ONE, "one".trim(), "one");
        assertEquals(ONE, " one more time".trim(), __);
        assertEquals(ONE, " one more time         ".trim(), __);
        assertEquals(ONE, " and again\t".trim(), __);
        assertEquals(ONE, "\t\t\twhat about now?\t".trim(), __);
    }

    @Test
    public void stringConcatenation() {
        String one = "one";
        String space = " ";
        String two = "two";
        assertEquals(ONE, one + space + two, __);
        assertEquals(ONE, space + one + two, __);
        assertEquals(ONE, two + space + one, __);
    }

    @Test
    public void stringUpperCase() {
        String str = "I am a number one!";
        assertEquals(ONE, str.toUpperCase(), __);
    }

    @Test
    public void stringLowerCase() {
        String str = "I AM a number ONE!";
        assertEquals(ONE, str.toLowerCase(), __);
    }

    @Test
    public void stringCompare() {
        String str = "I AM a number ONE!";
        assertEquals(ONE, str.compareTo("I AM a number ONE!") == 0, __);
        assertEquals(ONE, str.compareTo("I am a number one!") == 0, __);
        assertEquals(ONE, str.compareTo("I AM A NUMBER ONE!") == 0, __);
    }

    @Test
    public void stringCompareIgnoreCase() {
        String str = "I AM a number ONE!";
        assertEquals(ONE, str.compareToIgnoreCase("I AM a number ONE!") == 0, __);
        assertEquals(ONE, str.compareToIgnoreCase("I am a number one!") == 0, __);
        assertEquals(ONE, str.compareToIgnoreCase("I AM A NUMBER ONE!") == 0, __);
    }

    @Test
    public void stringStartsWith() {
        assertEquals(ONE, "".startsWith("one"), __);
        assertEquals(ONE, "one".startsWith("one"), __);
        assertEquals(ONE, "one is the number".startsWith("one"), __);
        assertEquals(ONE, "ONE is the number".startsWith("one"), __);
    }

    @Test
    public void stringEndsWith() {
        assertEquals(ONE, "".endsWith("one"), __);
        assertEquals(ONE, "one".endsWith("one"), __);
        assertEquals(ONE, "the number is one".endsWith("one"), __);
        assertEquals(ONE, "the number is two".endsWith("one"), __);
        assertEquals(ONE, "the number is One".endsWith("one"), __);
    }

    @Test
    public void stringSubstring() {
        String str = "I AM a number ONE!";
        assertEquals(ONE, str.substring(0), __);
        assertEquals(ONE, str.substring(1), __);
        assertEquals(ONE, str.substring(5), __);
        assertEquals(ONE, str.substring(14, 17), __);
        assertEquals(ONE, str.substring(7, str.length()), __);
    }

    @Test
    public void stringContains() {
        String str = "I AM a number ONE!";
        assertEquals(ONE, str.contains("one"), __);
        assertEquals(ONE, str.contains("ONE"), __);
    }

    @Test
    public void stringReplace() {
        String str = "I am a number ONE!";
        assertEquals(ONE, str.replace("ONE", "TWO"), __);
        assertEquals(ONE, str.replace("I am", "She is"),  __);
    }

    @Test
    public void stringBuilderCanActAsAMutableString() {
        assertEquals(ONE, new StringBuilder("one").append(" ").append("two").toString(), __);
    }

    @Test
    public void readableStringFormattingWithStringFormat() {
        assertEquals(ONE, String.format("%s %s %s", "a", "b", "a"), __);
    }

    @Test
    public void extraArgumentsToStringFormatGetIgnored() {
        assertEquals(ONE, String.format("%s %s %s", "a", "b", "c", "d"), __);
    }

    @Test
    public void insufficientArgumentsToStringFormatCausesAnError() {
        try {
            String.format("%s %s %s", "a", "b");
            fail("No Exception was thrown!");
        } catch (Exception e) {
            assertEquals(TWO, e.getClass(), __);
            assertEquals(TWO, e.getMessage(), __);
        }
    }

    @Test
    public void readableStringFormattingWithMessageFormat() {
        assertEquals(THREE, MessageFormat.format("{0} {1} {0}", "a", "b"), __);
    }

    @Test
    public void extraArgumentsToMessageFormatGetIgnored() {
        assertEquals(THREE, MessageFormat.format("{0} {1} {0}", "a", "b", "c"), __);
    }

    @Test
    public void insufficientArgumentsToMessageFormatDoesNotReplaceTheToken() {
        assertEquals(THREE, MessageFormat.format("{0} {1} {0}", "a"), __);
    }
}
