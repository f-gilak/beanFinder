package org.gilak.beanFinder.registerable;

public interface Registerable<T extends Object> {

    boolean support(T object);
}
