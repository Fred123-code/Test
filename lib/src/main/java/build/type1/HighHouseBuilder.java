package build.type1;

public class HighHouseBuilder extends HouseBuilder{
    @Override
    public void buildBaise() {
        System.out.println("1001cm");
    }

    @Override
    public void buildWalls() {
        System.out.println("1002cm");
    }

    @Override
    public void roofed() {
        System.out.println("1003cm");
    }
}
