package factory.type1.pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备希腊披萨的原材料");
    }
}
