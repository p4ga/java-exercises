package com.pairgood.instruction.inheritance;

import com.pairgood.instruction.BaseStep;

public interface Step extends BaseStep {

    String ONE =
            HEADER + "Bob the cow implemented the abstract Animal class's makeSomeNoise() method.\n" +
                    "Fill in the blank with the String that the Cow class returns." + FOOTER;

    String TWO =
            HEADER + "Max the dog implemented the abstract Animal class's makeSomeNoise() method.\n" +
                    "Fill in the blank with the String that the Dog class returns." + FOOTER;

    String THREE =
            HEADER + "Barney the puppy implemented the abstract Animal class's makeSomeNoise() method.\n" +
                    "Fill in the blank with the String that the Puppy class returns." + FOOTER;

    String FOUR =
            HEADER + "Max the dog provides a canFetch() method that's not declared in the Animal class.\n" +
                    "Fill in the blank with the boolean (true/false) value that the Dog class returns." + FOOTER;

    String FIVE =
            HEADER + "Barney the puppy provides a canFetch() method that's not declared in the Animal class.\n" +
                    "Fill in the blank with the boolean (true/false) value that the Puppy class returns." + FOOTER;

    String SIX =
            HEADER + "Bob is declared as the type Animal instead of type Cow (`Animal bob = new Cow();`).\n" +
                    "Fill in the blank with the String that the Animal returns." + FOOTER;
    String SEVEN =
            HEADER + "Max is declared as the type Animal instead of type Dog (`Animal max = new Dog();`).\n" +
                    "Fill in the blank with the String that the Animal returns." + FOOTER;
    String EIGHT =
            HEADER + "Barney is declared as the type Animal instead of type Dog (`Animal barney = new Puppy();`).\n" +
                    "Fill in the blank with the String that the Animal returns." + FOOTER;
    String NINE =
            HEADER + "The equals() operator for two String value compares if the values are equal.  It returns\n" +
                    "either true or false.\n" +
                    "Fill in the blank with the answer true or false as to whether the makeSomeNoise() methods\n" +
                    "return the same String value." + FOOTER;
    String TEN =
            HEADER + "The java instanceof operator is used to test whether the object is an instance of the\n" +
                    "specified type (class or subclass or interface). The instanceof in java is also known as\n" +
                    "type comparison operator because it compares the instance with type. It returns either\n" +
                    " true or false.\n" +
                    "Fill in the blank with the answer true or false as to whether bob is an instance of the given type." + FOOTER;
}
