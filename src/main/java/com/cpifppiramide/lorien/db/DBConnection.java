package com.cpifppiramide.lorien.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {


    private static Connection connection;

    private DBConnection(){}

    public static Connection getInstance() {
        if(connection == null) {
            try {
                connection = DriverManager.getConnection(
                        "jdbc:mysql://bbddfutbol.cbsz60aw84n4.us-east-1.rds.amazonaws.com/lorienprueba",
                        "admin", "bbddFutbol");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }

}