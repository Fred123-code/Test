package Single.type3;

public class SingletonTest3 {
    public static void main(String[] args) {
        System.out.println("懒汉式~~~~~");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hascode : " + instance1);
        System.out.println("instance2.hascode : " + instance2);
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){

        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void age(){
        System.out.println("age");
    }
}
