package top.hwh228.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.Assert;
import top.hwh228.model.Student;

import java.util.List;

/**
 * Created with IDEA
 * author:houwenhua
 * Date:2018/2/27 0027
 * Time:下午 5:20
 */
public class TestStudentDaoSpringJDBC {
    private ApplicationContext ctx = null;
    private StudentDaoSpringJDBC sd = null;

    @Before
    public void setup(){
        ctx = new ClassPathXmlApplicationContext("bean.xml");
        sd = (StudentDaoSpringJDBC)ctx.getBean("jt");
        System.out.println("setup");
    }

    @After
    public void close(){
        ctx = null;
        System.out.println("close");
    }
    @Test
    public void testQuery () {
        List<Student> list = sd.query();
        for (Student stu : list){
            System.out.println(stu);
        }
    }
    @Test
    public void testSave () {
        Student stu = new Student();
        stu.setName("李四");
        sd.save(stu);
    }
}
