package top.hwh228.dao;

import top.hwh228.model.Student;
import top.hwh228.utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 * author:houwenhua
 * Date:2018/2/27 0027
 * Time:下午 4:11
 */
public class StudentDao {
    /**
     * 查询所有学生
     * 返回所有学生
     * */
    public List<Student> query() {
        //结果集存放用的list
        List list = new ArrayList();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from springdata";
        //用于存放的Student对象
        Student stu = null;
        try {
            conn =  JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            //遍历结果集
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                stu = new Student();
                stu.setId(id);
                stu.setName(name);

                list.add(stu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(rs,ps,conn);
        }
        return list;
    }

    public void save(Student stu){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "insert into springdata(name) value(?)";

        try {
            conn =  JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,stu.getName());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(rs,ps,conn);
        }
    }
}
