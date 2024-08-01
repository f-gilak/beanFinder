package org.gilak.beanFinder.fruit;

import org.springframework.stereotype.Component;

@Component
public class Apple implements Fruit {

    @Override
    public boolean support(FruitType fruitType) {
        return FruitType.APPLE.equals(fruitType);
    }

    @Override
    public void getColor() {
        System.out.println("Apple: yellow");
    }
}
