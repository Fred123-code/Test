package Single.type5;

public class SingletonTest5 {
    public static void main(String[] args) {
        System.out.println("双重检查~~~~~，同步效率低。");
        Singleton instance1 = Singleton.getInstance();
       Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hascode : " + instance1);
        System.out.println("instance2.hascode : " + instance2);
    }
}
class Singleton{
    private static volatile Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
