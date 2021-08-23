package staticproxy.type1;

public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();

        TeacherDaoProoxy teacherDaoProoxy = new TeacherDaoProoxy(teacherDao);

        teacherDaoProoxy.teach();
    }
}
