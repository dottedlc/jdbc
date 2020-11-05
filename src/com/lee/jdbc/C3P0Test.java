package com.lee.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author dottedL
 * @create 2020-10-29-12:12
 */
public class C3P0Test {

    public static void main(String[] args) throws SQLException {
        DataSource ds = new ComboPooledDataSource();
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
