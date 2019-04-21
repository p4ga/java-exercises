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
        assertEquals(ONE, bob.makeSomeNoise(), "Moo!");
        assertEquals(TWO, max.makeSomeNoise(), "Woof!");
        assertEquals(THREE, barney.makeSomeNoise(), "Squeak!");

        assertEquals(FOUR, max.canFetch(), "true");
        assertEquals(FIVE, barney.canFetch(), "false");
        // but can Bob the Cow fetch?
    }

    @Test
    public void methodOverloadingUsingPolymorphism() {
        Animal bob = new Cow();
        Animal max = new Dog();
        Animal barney = new Puppy();
        assertEquals(SIX, bob.makeSomeNoise(), "Moo!");
        assertEquals(SEVEN, max.makeSomeNoise(), "Woof!");
        assertEquals(EIGHT, barney.makeSomeNoise(), "Squeak!");
        // but can max or barney (here as an Animal) fetch?
        // try to write it down here
    }

    @Test
    public void inheritanceHierarchy() {
        Animal someAnimal = new Cow();
        Animal bob = new Cow();
        assertEquals(NINE, someAnimal.makeSomeNoise().equals(bob.makeSomeNoise()), true);
        // cow is a Cow, but it can also be an animal
        assertEquals(TEN, bob instanceof Animal, true);
        assertEquals(TEN, bob instanceof Cow, true);
        // but is it a Puppy?
        assertEquals(TEN, bob instanceof Puppy, false);
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
