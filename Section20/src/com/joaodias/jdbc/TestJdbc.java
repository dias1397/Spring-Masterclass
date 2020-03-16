package com.joaodias.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

    public static void main(String[] args) {

        String jdbcUrl = "jdbc:sqlserver://HOME-DESKTOP\\SQLEXPRESS:1434;databaseName=hb_student_tracker;user=hbstudent;password=hbstudent";

        try {
            System.out.println("Connecting to database: " + jdbcUrl);
            Connection myconn = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connection Successfull!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
