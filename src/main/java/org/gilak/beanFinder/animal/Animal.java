package org.gilak.beanFinder.animal;

import org.gilak.beanFinder.registerable.Registerable;

public interface Animal extends Registerable<AnimalType> {

    @Override
    boolean support(AnimalType animalType);

    void makeSound();
}
