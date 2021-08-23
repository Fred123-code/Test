package build.type1;

public abstract class HouseBuilder {

    protected  House house = new House();

    public abstract void buildBaise();
    public abstract void buildWalls();
    public abstract void roofed();

    public House buildHouse(){
        return house;
    }

}
