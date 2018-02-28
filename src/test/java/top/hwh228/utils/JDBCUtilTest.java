package top.hwh228.utils;

import junit.framework.Assert;
import org.junit.Test;

import java.sql.Connection;

public class JDBCUtilTest {

    @Test
    public void testGetConnection() throws Exception {
        Connection conn =  JDBCUtil.getConnection();
        Assert.assertNotNull(conn);
    }
}
