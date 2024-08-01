package org.gilak.beanFinder.fruit;

import org.gilak.beanFinder.registerable.Registerable;

public interface Fruit extends Registerable<FruitType> {

    @Override
    boolean support(FruitType fruitType);

    void getColor();
}
