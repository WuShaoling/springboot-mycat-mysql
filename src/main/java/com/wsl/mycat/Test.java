package com.wsl.mycat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

    // static final String DB_URL = "jdbc:mysql://47.102.10.114:53310/TESTDB";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:8066/business";
    static final String USER = "root";
    static final String PASS = "12345678";
    static Connection conn = null;
    static Statement stmt = null;

    public static void getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("连接数据库...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public static void closeConnect() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }

    public static void insertCompany() throws SQLException {
        stmt = conn.createStatement();
        for (int i = 1; i <= 50; i++) {
            String sql = "insert into company (name) values(\"" + "company" + i + "\")";
            System.out.println(i + "-->" + stmt.execute(sql));
        }
        stmt.close();
    }

    public static void insertHotNews() throws SQLException {
        stmt = conn.createStatement();
        for (int i = 1; i <= 50; i++) {
            String sql = "insert into hotnews(title) values(\"" + "hotnews" + i + "\")";
            System.out.println(i + "-->" + stmt.execute(sql));
        }
        stmt.close();
    }

    public static void insertTravelRecord() throws SQLException {
        stmt = conn.createStatement();
        for (int i = 1; i <= 50; i++) {
            String sql = "insert into travelrecord (area) values(" + i + ")";
            System.out.println(i + "-->" + stmt.execute(sql));
        }
        stmt.close();
    }

    public static void insertGoods() throws SQLException {
        stmt = conn.createStatement();
        for (int i = 1; i <= 50; i++) {
            String sql = "insert into goods(name) values(\"name" + i + "\")";
            System.out.println(i + "-->" + stmt.execute(sql));
        }
        stmt.close();
    }

    public static void insertOrders() throws SQLException {
        stmt = conn.createStatement();
        for (int i = 1; i <= 50; i++) {
            String sql = "insert into orders(name,attributes) values(\"name" + i + "\", \"attribute" + i + "\")";
            System.out.println(i + "-->" + stmt.execute(sql));
        }
        stmt.close();
    }

    public static void insertCustomer() throws SQLException {
        stmt = conn.createStatement();
        int gender;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                gender = 100000;
            } else {
                gender = 100001;
            }
            String sql = "insert into customer(id, name, gender) values(" + i + ", \"name" + i + "\", " + gender + ")";
            System.out.println(sql);
            System.out.println(i + "-->" + stmt.execute(sql));

            sql = "insert into customer_addr(id, customer_id, addr) values(" + i + "," + i + ",\"addr" + i + "\")";
            System.out.println(sql);
            System.out.println(i + "-->" + stmt.execute(sql));
        }
        stmt.close();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        getConnect();
//        insertCompany();
//        insertTravelRecord();
//        insertHotNews();
//        insertGoods();
//        insertOrders();
        insertCustomer();
        closeConnect();
    }

}
