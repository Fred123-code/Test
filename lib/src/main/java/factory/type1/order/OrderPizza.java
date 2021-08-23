package factory.type1.order;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factory.type1.SingleFactory;
import factory.type1.pizza.Pizza;

public class OrderPizza {

    SingleFactory singleFactory;
    Pizza pizza = null;

    public OrderPizza(SingleFactory singleFactory){
        setSingleFactory(singleFactory);
    }


    public void setSingleFactory(SingleFactory singleFactory) {
        String orderType = "";

        this.singleFactory = singleFactory;

        do {
            orderType = getType();
            pizza = this.singleFactory.createPizza(orderType);

            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购Pizza失败");
                break;
            }
        }while (true);

    }


    private String getType(){
        BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入 Pizza 种类");
        try {

            String str = strin.readLine();
            return  str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }
}
