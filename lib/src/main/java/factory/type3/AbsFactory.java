package factory.type3;

import factory.type3.pizza.Pizza;

public interface AbsFactory {

    public Pizza createPizza(String orderType);
}
