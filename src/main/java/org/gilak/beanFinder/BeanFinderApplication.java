package org.gilak.beanFinder;

import org.gilak.beanFinder.animal.Animal;
import org.gilak.beanFinder.animal.AnimalType;
import org.gilak.beanFinder.fruit.Fruit;
import org.gilak.beanFinder.fruit.FruitType;
import org.gilak.beanFinder.registerable.GeneralBeanFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanFinderApplication implements CommandLineRunner {

    @Autowired
    private GeneralBeanFinder generalBeanFinder;

    public static void main(String[] args) {
        SpringApplication.run(BeanFinderApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Animal animal1 = generalBeanFinder.getProperBean(Animal.class, AnimalType.DOG);
        Animal animal2 = generalBeanFinder.getProperBean(Animal.class, AnimalType.CAT);
        animal1.makeSound();
        animal2.makeSound();

        generalBeanFinder.getProperBean(Fruit.class, FruitType.PEACH).getColor();
        generalBeanFinder.getProperBean(Fruit.class, FruitType.ORANGE).getColor();
        generalBeanFinder.getProperBean(Fruit.class, FruitType.APPLE).getColor();

    }
}
