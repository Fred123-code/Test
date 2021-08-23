package Single.type7;



public class SingletonTest7 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hascode : " + instance1);
        System.out.println("instance2.hascode : " + instance2);

        instance1.sayOK();
    }
}

enum Singleton{
    INSTANCE;

    public void sayOK(){
        System.out.println("OK~~~");
    }
}

