package org.gilak.beanFinder.registerable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class GeneralBeanFinder {

    @Autowired
    private ApplicationContext applicationContext;

    public <T extends Registerable> T getProperBean(Class<T> clazz, Object type) {
        return applicationContext.getBeansOfType(clazz).values().stream().filter(bean -> bean.support(type))
                .findFirst().orElse(null);
    }
}