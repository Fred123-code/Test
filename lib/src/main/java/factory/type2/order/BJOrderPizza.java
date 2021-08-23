package factory.type2.order;


import factory.type2.pizza.LDCheesePizza;
import factory.type2.pizza.LDPepperPizza;
import factory.type2.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }

        return pizza;

    }
}
