package factory.type3.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的胡椒Pizza");
        System.out.println("伦敦的胡椒Pizza ， 准备原材料");
    }
}
