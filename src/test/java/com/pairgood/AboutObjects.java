package com.pairgood;

import com.pairgood.instruction.Step;
import org.junit.Test;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import static com.pairgood.helper.Koan.__;
import static org.junit.Assert.assertEquals;

public class AboutObjects {

    @Test
    public void newObjectInstancesCanBeCreatedDirectly() {
        Object object = new Object();
        assertEquals(Step.ONE, object instanceof Object, true);
    }

    @Test
    public void allClassesInheritFromObject() {
        class Foo {
        }

        Foo foo = new Foo();

        Class<?>[] ancestors = getAncestors(foo);

        assertEquals(Step.TWO, ancestors[0], Foo.class);
        assertEquals(Step.TWO, ancestors[1], Object.class);
    }

    @Test
    public void objectToString() {
        Object object = new Object();
        String expectedToString = MessageFormat.format("{0}@{1}", Object.class.getName(),
                Integer.toHexString(object.hashCode()));

        assertEquals(Step.THREE, expectedToString, object.toString());
    }

    private Class<?>[] getAncestors(Object object) {
        List<Class<?>> ancestors = new ArrayList<>();
        Class<?> clazz = object.getClass();
        while (clazz != null) {
            ancestors.add(clazz);
            clazz = clazz.getSuperclass();
        }
        return ancestors.toArray(new Class[]{});
    }
}
