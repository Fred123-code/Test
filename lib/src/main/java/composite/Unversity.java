package composite;

import java.util.ArrayList;
import java.util.List;

public class Unversity extends OrganizationCompomet{

    List<OrganizationCompomet> organizationCompomets = new ArrayList<OrganizationCompomet>();


    public Unversity(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationCompomet organizationCompomet) {
        organizationCompomets.add(organizationCompomet);
    }

    @Override
    protected void remove(OrganizationCompomet organizationCompomet) {
        organizationCompomets.remove(organizationCompomet);
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void print() {
        System.out.println("++++++++++" + getName() + "+++++++++++++");
        for (OrganizationCompomet organizationCompomet:organizationCompomets){
            organizationCompomet.print();
        }
    }
}
