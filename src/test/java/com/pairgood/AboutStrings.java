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
        assertEquals(ONE, "just a plain ole string".getClass(), String.class);
    }

    @Test
    public void newString() {
        // very rarely if ever should Strings be created via new String() in
        // practice - generally it is redundant, and done repetitively can be slow
        String string = new String();
        String empty = "";
        assertEquals(ONE, string.equals(empty), true);
    }

    @Test
    public void newStringIsRedundant() {
        String stringInstance = "zero";
        String stringReference = new String(stringInstance);
        assertEquals(ONE, stringInstance.equals(stringReference), true);
    }

    @Test
    public void newStringIsNotIdentical() {
        String stringInstance = "zero";
        String stringReference = new String(stringInstance);
        assertEquals(ONE, stringInstance == stringReference, false);
    }

    @Test
    public void stringIsEmpty() {
        assertEquals(ONE, "".isEmpty(), true);
        assertEquals(ONE, "one".isEmpty(), false);
        assertEquals(ONE, new String().isEmpty(), true);
        assertEquals(ONE, new String("").isEmpty(), true);
        assertEquals(ONE, new String("one").isEmpty(), false);
    }

    @Test
    public void stringLength() {
        assertEquals(ONE, "".length(), 0);
        assertEquals(ONE, "one".length(), 3);
        assertEquals(ONE, "the number is one".length(), 17);
    }

    @Test
    public void stringTrim() {
        assertEquals(ONE, "".trim(), "");
        assertEquals(ONE, "one".trim(), "one");
        assertEquals(ONE, " one more time".trim(), "one more time");
        assertEquals(ONE, " one more time         ".trim(), "one more time");
        assertEquals(ONE, " and again\t".trim(), "and again");
        assertEquals(ONE, "\t\t\twhat about now?\t".trim(), "what about now?");
    }

    @Test
    public void stringConcatenation() {
        String one = "one";
        String space = " ";
        String two = "two";
        assertEquals(ONE, one + space + two, "one two");
        assertEquals(ONE, space + one + two, " onetwo");
        assertEquals(ONE, two + space + one, "two one");
    }

    @Test
    public void stringUpperCase() {
        String str = "I am a number one!";
        assertEquals(ONE, str.toUpperCase(), "I AM A NUMBER ONE!");
    }

    @Test
    public void stringLowerCase() {
        String str = "I AM a number ONE!";
        assertEquals(ONE, str.toLowerCase(), "i am a number one!");
    }

    @Test
    public void stringCompare() {
        String str = "I AM a number ONE!";
        assertEquals(ONE, str.compareTo("I AM a number ONE!") == 0, true);
        assertEquals(ONE, str.compareTo("I am a number one!") == 0, false);
        assertEquals(ONE, str.compareTo("I AM A NUMBER ONE!") == 0, false);
    }

    @Test
    public void stringCompareIgnoreCase() {
        String str = "I AM a number ONE!";
        assertEquals(ONE, str.compareToIgnoreCase("I AM a number ONE!") == 0, true);
        assertEquals(ONE, str.compareToIgnoreCase("I am a number one!") == 0, true);
        assertEquals(ONE, str.compareToIgnoreCase("I AM A NUMBER ONE!") == 0, true);
    }

    @Test
    public void stringStartsWith() {
        assertEquals(ONE, "".startsWith("one"), false);
        assertEquals(ONE, "one".startsWith("one"), true);
        assertEquals(ONE, "one is the number".startsWith("one"), true);
        assertEquals(ONE, "ONE is the number".startsWith("one"), false);
    }

    @Test
    public void stringEndsWith() {
        assertEquals(ONE, "".endsWith("one"), false);
        assertEquals(ONE, "one".endsWith("one"), true);
        assertEquals(ONE, "the number is one".endsWith("one"), true);
        assertEquals(ONE, "the number is two".endsWith("one"), false);
        assertEquals(ONE, "the number is One".endsWith("one"), false);
    }

    @Test
    public void stringSubstring() {
        String str = "I AM a number ONE!";
        assertEquals(ONE, str.substring(0), "I AM a number ONE!");
        assertEquals(ONE, str.substring(1), " AM a number ONE!");
        assertEquals(ONE, str.substring(5), "a number ONE!");
        assertEquals(ONE, str.substring(14, 17), "ONE");
        assertEquals(ONE, str.substring(7, str.length()), "number ONE!");
    }

    @Test
    public void stringContains() {
        String str = "I AM a number ONE!";
        assertEquals(ONE, str.contains("one"), false);
        assertEquals(ONE, str.contains("ONE"), true);
    }

    @Test
    public void stringReplace() {
        String str = "I am a number ONE!";
        assertEquals(ONE, str.replace("ONE", "TWO"), "I am a number TWO!");
        assertEquals(ONE, str.replace("I am", "She is"),  "She is a number ONE!");
    }

    @Test
    public void stringBuilderCanActAsAMutableString() {
        assertEquals(ONE, new StringBuilder("one").append(" ").append("two").toString(), "one two");
    }

    @Test
    public void readableStringFormattingWithStringFormat() {
        assertEquals(ONE, String.format("%s %s %s", "a", "b", "a"), "a b a");
    }

    @Test
    public void extraArgumentsToStringFormatGetIgnored() {
        assertEquals(ONE, String.format("%s %s %s", "a", "b", "c", "d"), "a b c");
    }

    @Test
    public void insufficientArgumentsToStringFormatCausesAnError() {
        try {
            String.format("%s %s %s", "a", "b");
            fail("No Exception was thrown!");
        } catch (Exception e) {
            assertEquals(TWO, e.getClass(), java.util.MissingFormatArgumentException.class);
            assertEquals(TWO, e.getMessage(), "Format specifier '%s'");
        }
    }

    @Test
    public void readableStringFormattingWithMessageFormat() {
        assertEquals(THREE, MessageFormat.format("{0} {1} {0}", "a", "b"), "a b a");
    }

    @Test
    public void extraArgumentsToMessageFormatGetIgnored() {
        assertEquals(THREE, MessageFormat.format("{0} {1} {0}", "a", "b", "c"), "a b a");
    }

    @Test
    public void insufficientArgumentsToMessageFormatDoesNotReplaceTheToken() {
        assertEquals(THREE, MessageFormat.format("{0} {1} {0}", "a"), "a {1} a");
    }
}
