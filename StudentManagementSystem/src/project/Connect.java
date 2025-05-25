/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Hp
 */
public class Connect {
    private static Connection mysqlkoneksi;

public static Connection koneksiDB() throws SQLException {
    if (mysqlkoneksi == null || mysqlkoneksi.isClosed()) {
        try {
            String DB = "jdbc:mysql://localhost:3306/dbstudents";
            String user = "Ruben";
            String pass = "jakarta";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlkoneksi = (Connection)DriverManager.getConnection(DB, user, pass);
            System.out.println("Connection database is success");
        } catch (SQLException e) {
             System.out.println("Connection database is failed " + e.getMessage());
            throw e;
        }
    }
    return mysqlkoneksi;
}
}
