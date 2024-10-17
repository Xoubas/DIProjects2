/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conection;

import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author stx
 */
public class Conexion {

    java.sql.Connection con;

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "root");

        } catch (Exception e) {
            System.err.println("Error, no se pudo conectar con la base de datos. Error: " + e);
        }
    }

    public Connection getConexion() {
        return con;
    }
}
