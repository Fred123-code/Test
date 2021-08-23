package factory.type1.pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备奶酪披萨的原材料");
    }
}
