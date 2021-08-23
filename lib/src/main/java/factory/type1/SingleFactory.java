package factory.type1;

import factory.type1.pizza.CheesePizza;
import factory.type1.pizza.GreekPizza;
import factory.type1.pizza.PepperPizza;
import factory.type1.pizza.Pizza;

public class SingleFactory {

    public Pizza createPizza(String orederType){

        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orederType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (orederType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if (orederType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }
}