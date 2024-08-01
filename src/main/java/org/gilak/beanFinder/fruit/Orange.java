package org.gilak.beanFinder.fruit;

import org.springframework.stereotype.Component;

@Component
public class Orange implements Fruit {

    @Override
    public boolean support(FruitType fruitType) {
        return FruitType.ORANGE.equals(fruitType);
    }

    @Override
    public void getColor() {
        System.out.println("Orange: orange");
    }
}
