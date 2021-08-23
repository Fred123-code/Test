package factory.type1;

import factory.type1.order.OrderPizza;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SingleFactory());
        System.out.println("~~退出程序~~");
    }
}
