package Adapter.type2;

public class Client {
    public static void main(String[] args) {
        System.out.println("充电");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
