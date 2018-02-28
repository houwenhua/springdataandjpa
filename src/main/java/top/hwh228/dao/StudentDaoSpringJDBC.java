package top.hwh228.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import top.hwh228.model.Student;
import top.hwh228.utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 * author:houwenhua
 * Date:2018/2/27 0027
 * Time:下午 5:09
 */
public class StudentDaoSpringJDBC {
    private JdbcTemplate jt;

    public List<Student> query() {
        //结果集存放用的list
        final List list = new ArrayList();
        String sql = "select * from springdata";
        jt.query(sql, new RowCallbackHandler(){

            public void processRow(ResultSet resultSet) throws SQLException {


                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");

                    Student stu = new Student();
                    stu.setId(id);
                    stu.setName(name);

                    list.add(stu);


            }
        });
        return list;
    }

    public void save(Student stu){

        String sql = "insert into springdata(name) value(?)";
        jt.update(sql,new Object[]{stu.getName()});
    }

    public JdbcTemplate getJt() {
        return jt;
    }

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }
}
