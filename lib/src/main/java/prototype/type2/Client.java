package prototype.type2;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();

        p.name = "宋江";
        p.deepCloneTarget = new DeepCloneTarget("大牛","大牛的类");


        DeepProtoType p2 = (DeepProtoType) p.clone();


        System.out.println("p.name" + p.name + "p.deepCloneTarget" + p.deepCloneTarget.hashCode());
        System.out.println("p2.name" + p2.name + "p2.deepCloneTarget" + p2.deepCloneTarget.hashCode());
    }
}
