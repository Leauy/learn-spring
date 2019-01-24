package com.myapp;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Cold
@Creamy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class IceCream implements Desert {
}
