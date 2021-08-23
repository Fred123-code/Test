package staticproxy.type1;

public class TeacherDaoProoxy implements ITeacherDao{

    private ITeacherDao target;

    public TeacherDaoProoxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始.");
        target.teach();
        System.out.println("提交....");
    }
}
