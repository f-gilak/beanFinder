package org.gilak.beanFinder.fruit;

import org.springframework.stereotype.Component;

@Component
public class Peach implements Fruit {

    @Override
    public boolean support(FruitType fruitType) {
        return FruitType.PEACH.equals(fruitType);
    }

    @Override
    public void getColor() {
        System.out.println("Peach :peach");
    }
}
