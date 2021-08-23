package composite;

public abstract class OrganizationCompomet {
    private String name;//名字
    private String des; //说明

    protected void add(OrganizationCompomet organizationCompomet){
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationCompomet organizationCompomet){
        throw new UnsupportedOperationException();
    }

    public OrganizationCompomet(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }

    protected abstract void print();
}
