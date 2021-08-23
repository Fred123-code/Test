package decorator;

public class Decorator extends Drink{

    private Drink obj;


    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }


    @Override
    public String getDes() {
        //被装饰着
        return super.getDes() + super.getPrice() + obj.cost();
    }
}
