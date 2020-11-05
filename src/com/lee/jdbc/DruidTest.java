package com.lee.jdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author dottedL
 * @create 2020-10-29-12:19
 */
public class DruidTest {

    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        InputStream is = DruidTest.class.getClassLoader().getResourceAsStream("druid.properties");
        p.load(is);
        DataSource ds = DruidDataSourceFactory.createDataSource(p);
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
