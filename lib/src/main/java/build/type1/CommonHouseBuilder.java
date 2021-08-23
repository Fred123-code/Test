package build.type1;

public class CommonHouseBuilder extends HouseBuilder{

    @Override
    public void buildBaise() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子翻墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封锁");
    }
}
