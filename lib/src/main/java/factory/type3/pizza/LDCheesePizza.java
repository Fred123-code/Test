package factory.type3.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的奶酪Pizza");
        System.out.println("伦敦的奶酪Pizza ， 准备原材料");
    }
}
