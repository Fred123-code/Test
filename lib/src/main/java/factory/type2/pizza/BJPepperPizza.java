package factory.type2.pizza;

public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京的胡椒Pizza");
        System.out.println("北京的胡椒Pizza ， 准备原材料");
    }
}
