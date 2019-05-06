package com.pairgood.instruction.strings;

import com.pairgood.instruction.BaseStep;

public interface Step extends BaseStep {

    String ONE =
            HEADER + "Hint: For more information on String's methods visit " +
                    "https://docs.oracle.com/javase/8/docs/api/java/lang/String.html" + FOOTER;

    String TWO =
            HEADER + "Hint: For more information on the Exception class visit " +
                    "https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html" + FOOTER;

    String THREE =
            HEADER + "Hint: For more information on the MessageFormat class visit " +
                    "https://docs.oracle.com/javase/8/docs/api/java/text/MessageFormat.html" + FOOTER;
}
