package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    DbManager dbManager;

    @Before
    public void initializing() throws SQLException {
        dbManager = DbManager.getInstance();
    }

    @Test
    public void testConnect() throws SQLException {
        //Given

        //When

        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given

        //When
        String sqlQuery = "SELECT count(*) as post_number, concat(t1.FIRSTNAME, \" \",t1.LASTNAME ) as user\n" +
                "FROM users t1, posts t2\n" +
                "where t1.ID=t2.USER_ID\n" +
                "group by t1.ID\n" +
                "having count(*)>1\n" +
                "order by 2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("POST_NUMBER") + ", " +
                    rs.getString("USER"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(2, counter);

    }
}