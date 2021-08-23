package factory.type3;

import factory.type3.order.OrderPizza;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
