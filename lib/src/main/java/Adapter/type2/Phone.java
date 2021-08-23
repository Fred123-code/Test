package Adapter.type2;

public class Phone {

    public void charging(Voltage5V voltage5V){
        if (voltage5V.vo5V()==5){
            System.out.println("电压为5V 可以充电~~");
        }else if (voltage5V.vo5V()>5){
            System.out.println("电压过高");
        }
    }
}
