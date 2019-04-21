package com.pairgood.instruction.primitives;

import com.pairgood.instruction.BaseStep;

public interface Step extends BaseStep {

    String ONE =
            HEADER + "Hint: int.class" + FOOTER;

    String TWO =
            HEADER + "Primitives can be automatically changed into their object type via a process called auto-boxing\n" +
                    "We will explore this in more detail in intermediate.AboutAutoboxing" + FOOTER;

    String THREE =
            HEADER + "The '(short)' is called an explicit cast - to type 'short'" + FOOTER;
}
