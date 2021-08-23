package factory.type2.pizza;

public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京的奶酪Pizza");
        System.out.println("北京的奶酪Pizza ， 准备原材料");
    }
}
