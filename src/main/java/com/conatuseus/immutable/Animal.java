package com.conatuseus.immutable;

public class Animal {

    private final Age age;

    public Animal(final Age age) {
        this.age = age;
    }

    public Age getAge() {
        return age;
    }

    public static void main(String[] args) {
        Age age = new Age(1);
        Animal animal = new Animal(age);

        System.out.println(animal.getAge().getValue());
        // Output: 1
    }
}

class Age {

    private final int value;

    public Age(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
