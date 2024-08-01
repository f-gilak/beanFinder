package org.gilak.beanFinder.animal;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    @Override
    public boolean support(AnimalType animalType) {
        return AnimalType.CAT.equals(animalType);
    }

    @Override
    public void makeSound() {
        System.out.println("MakeSound: Meaw");
    }
}
