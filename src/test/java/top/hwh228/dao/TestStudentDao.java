package top.hwh228.dao;

import org.junit.Test;
import top.hwh228.model.Student;

import java.util.List;

/**
 * Created with IDEA
 * author:houwenhua
 * Date:2018/2/27 0027
 * Time:下午 4:24
 */
public class TestStudentDao {

    @Test
    public void testQuery() {
        StudentDao sd = new StudentDao();
        List<Student> list = sd.query();
        for (Student stu : list){
            System.out.println(stu);
        }
    }

    @Test
    public void testSave() {

        StudentDao sd = new StudentDao();
        Student stu = new Student();
        stu.setName("张三");
        sd.save(stu);
    }
}
