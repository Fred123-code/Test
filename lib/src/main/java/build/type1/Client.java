package build.type1;

public class Client {
    public static void main(String[] args) {
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(commonHouseBuilder);

        House house = houseDirector.constructHouse();

        System.out.println("输出流程");
    }
}
