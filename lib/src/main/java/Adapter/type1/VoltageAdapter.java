package Adapter.type1;

public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int vo5V() {
        int srcV = output220V();
        int dsv = srcV/40;
        return dsv;
    }
}
