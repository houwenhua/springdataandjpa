package top.hwh228;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import javax.sql.DataSource;

/**
 * Created with IDEA
 * author:houwenhua
 * Date:2018/2/27 0027
 * Time:下午 4:55
 */
public class TestDataSource {
    private ApplicationContext ctx = null;

    @Before
    public void setup(){
        ctx = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("setup");
    }

    @After
    public void close(){
        ctx = null;
        System.out.println("close");
    }
    @Test
    public void testDataSource () {

        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        Assert.notNull(dataSource);
    }
}
