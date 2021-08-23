package Adapter.type2;

public class VoltageAdapter implements Voltage5V {
    private  Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int vo5V() {
        int dst = 0;
        if (voltage220V!=null){
            int srcV = voltage220V.output220V();
            System.out.println("适配完成");
            dst = srcV/44;
            System.out.println("适配完成，输出电压为= "+ dst);
        }


        return dst;
    }
}
