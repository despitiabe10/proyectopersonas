/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaobjetos;

import java.sql.*;

/**
 *
 * @author DAVIDESPITIA
 */
public class ConexionBD {
    
    public String driver = "com.mysql.cj.jdbc.Driver";    
    public String database = "DBPERSONAS?useTimezone=true&serverTimezone=UTC";
    public String hostname = "localhost";
    public String port = "3306";
    
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;
    
    public String username = "root";
    public String password = "1234567890";
    
    public Connection conexion = null;
    
    public Connection conectar() {        

        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
            return conexion;    

    }    
}
