package com.conatuseus.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListObject {

    private final List<Animal> animals;

    public ListObject(final List<Animal> animals) {
        this.animals = new ArrayList<>(animals);
    }

    public List<Animal> getAnimals() {
        return Collections.unmodifiableList(animals);
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(new Age(1)));

        ListObject listObject = new ListObject(animals);

        for (Animal animal : listObject.getAnimals()) {
            System.out.print(animal.getAge().getValue());
        }
        System.out.println();
        // Output: 1

        animals.add(new Animal(new Age(2)));

        for (Animal animal : listObject.getAnimals()) {
            System.out.print(animal.getAge().getValue());
        }
        System.out.println();
        // Output: 1
    }
}
