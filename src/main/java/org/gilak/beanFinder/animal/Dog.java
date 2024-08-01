package org.gilak.beanFinder.animal;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    @Override
    public boolean support(AnimalType animalType) {
        return AnimalType.DOG.equals(animalType);
    }

    @Override
    public void makeSound() {
        System.out.println("MakeSound: Barf");
    }
}
