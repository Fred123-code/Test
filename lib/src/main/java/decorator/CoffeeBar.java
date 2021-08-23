package decorator;

import java.sql.SQLOutput;

public class CoffeeBar {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println("费用1" + order.cost());
        System.out.println("费用2" + order.getDes());

        order = new Milk(order);

        System.out.println("费用1+牛奶" + order.cost());
        System.out.println("费用2+牛奶" + order.getDes());
    }
}
