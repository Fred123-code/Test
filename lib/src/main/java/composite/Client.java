package composite;

public class Client {
    public static void main(String[] args) {
        Unversity unversity = new Unversity("清华大","中国");
        College college1 = new College("清华计算机","计算机");
        College college2 = new College("清华软件","软件");

        college1.add(new Department("11","3333"));
        college1.add(new Department("22","4444"));

        college1.add(new Department("55","7777"));
        college1.add(new Department("66","8888"));

        unversity.print();

        college1.print();
    }
}
