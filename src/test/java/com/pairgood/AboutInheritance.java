package com.pairgood;


import org.junit.Test;

import static com.pairgood.helper.Koan.__;
import static com.pairgood.instruction.inheritance.Step.*;
import static org.junit.Assert.assertEquals;

public class AboutInheritance {

    abstract class Animal {
        abstract public String makeSomeNoise();
    }

    class Cow extends Animal {
        @Override
        public String makeSomeNoise() {
            return "Moo!";
        }
    }

    class Dog extends Animal {
        @Override
        public String makeSomeNoise() {
            return "Woof!";
        }

        public boolean canFetch() {
            return true;
        }
    }

    class Puppy extends Dog {
        @Override
        public String makeSomeNoise() {
            return "Squeak!";
        }
        public boolean canFetch() {
            return false;
        }
    }

    @Test
    public void methodOverloading() {
        Cow bob = new Cow();
        Dog max = new Dog();
        Puppy barney = new Puppy();
        assertEquals(ONE, bob.makeSomeNoise(), __);
        assertEquals(TWO, max.makeSomeNoise(), __);
        assertEquals(THREE, barney.makeSomeNoise(), __);

        assertEquals(FOUR, max.canFetch(), __);
        assertEquals(FIVE, barney.canFetch(), __);
        // but can Bob the Cow fetch?
    }

    @Test
    public void methodOverloadingUsingPolymorphism() {
        Animal bob = new Cow();
        Animal max = new Dog();
        Animal barney = new Puppy();
        assertEquals(SIX, bob.makeSomeNoise(), __);
        assertEquals(SEVEN, max.makeSomeNoise(), __);
        assertEquals(EIGHT, barney.makeSomeNoise(), __);
        // but can max or barney (here as an Animal) fetch?
        // try to write it down here
    }

    @Test
    public void inheritanceHierarchy() {
        Animal someAnimal = new Cow();
        Animal bob = new Cow();
        assertEquals(NINE, someAnimal.makeSomeNoise().equals(bob.makeSomeNoise()), __);
        // cow is a Cow, but it can also be an animal
        assertEquals(TEN, bob instanceof Animal, __);
        assertEquals(TEN, bob instanceof Cow, __);
        // but is it a Puppy?
        assertEquals(TEN, bob instanceof Puppy, __);
    }

    @Test
    public void deeperInheritanceHierarchy() {
        Dog max = new Dog();
        Puppy barney = new Puppy();
        assertEquals(TEN, max instanceof Puppy, __);
        assertEquals(TEN, max instanceof Dog, __);
        assertEquals(TEN, barney instanceof Puppy, __);
        assertEquals(TEN, barney instanceof Dog, __);
    }
}
