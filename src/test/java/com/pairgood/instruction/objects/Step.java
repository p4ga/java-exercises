package com.pairgood.instruction.objects;

import com.pairgood.instruction.BaseStep;

public interface Step extends BaseStep {

    String ONE =
            HEADER + "Hint: The java `instanceof` operator is used to test whether the object is an instance of\n" +
            "the specified type (class or subclass or interface). The `instanceof` in java is also known as type\n" +
            "comparison operator because it compares the instance with type. It returns either true or false.\n" +
            "Fill in the blank with true or false." + FOOTER;

    String TWO =
            HEADER + "The class from which the subclass is derived is called a superclass\n" +
            "(also a base class or a parent class). Except for the class Object, which has no superclass,\n" +
            "every class has one and only one direct superclass (single inheritance). In the absence of\n" +
            "any other explicit superclass, every class is implicitly a subclass of Object.\n" +
            "Fill in the blank with the class name followed by `.class`." + FOOTER;

    String THREE =
            HEADER + "The java toString() method is used when we need a string representation of an object.\n" +
                    "Class Name, “@”, and the hex version of the object's hashcode concatenated into a string.\n" +
                    "The default hashCode method in Object is typically implemented by converting the memory \n" +
                    "address of the object into an integer.\n" +
                    "Fill in the blank with a call to the `toString()` method on object." + FOOTER;
}
