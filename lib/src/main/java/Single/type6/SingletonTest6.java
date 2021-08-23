package Single.type6;


public class SingletonTest6 {

    public static void main(String[] args) {
        System.out.println("");
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

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
       return SingletonInstance.INSTANCE;
    }
}
