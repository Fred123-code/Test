package Single.type1;

public class SingletonTest1 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hascode : " + instance1);
        System.out.println("instance2.hascode : " + instance2);
    }
}

class Singleton{
    private Singleton(){

    }

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
