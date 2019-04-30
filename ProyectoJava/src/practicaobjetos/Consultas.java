/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaobjetos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DAVIDESPITIA
 */
public class Consultas {

    
    
    public void agregarPersona (Persona p, java.sql.Date sqldate) throws SQLException, ClassNotFoundException{
        String query = "";
        ConexionBD con = new ConexionBD();
        
        Statement sentencia = con.conectar().createStatement();
        
        query = "INSERT INTO Personas (tipo_documento, numero_documento, apellidos, nombres, fecha_nacimiento) "
                + "VALUES ('"+p.getTipodocumento()+"',"+"'"+p.getNum_documento()+"',"+"'"+p.getApellidos()+"',"+"'"
                +p.getNombres()+"',"+"'"+sqldate + "');";
        
        if (sentencia.executeUpdate(query) > 0) {
            System.out.println("El registro se insertó exitosamente.");
        } else {
            System.out.println("No se pudo insertar el registro.");
        }
        
        sentencia.close();
        con.conexion.close();
        
    }
    
    /**
     *
     * @param p
     * @param sqldate
     * @throws SQLException
     */
    public void editar_persona(Persona p, java.sql.Date sqldate) throws SQLException{
        String query = "";
        ConexionBD con = new ConexionBD();
        try {
            query = "UPDATE Personas SET tipo_documento = ? , apellidos = ? , nombres = ?,"
                     +"fecha_nacimiento = ? WHERE numero_documento = ?;";
            PreparedStatement sentenciaP = con.conectar().prepareStatement(query);
            sentenciaP.setInt(1, p.getTipodocumento());
            sentenciaP.setString(2, p.getApellidos());
            sentenciaP.setString(3, p.getNombres());            
            sentenciaP.setDate(4, sqldate);
            sentenciaP.setInt(5, p.getNum_documento());
            sentenciaP.executeUpdate();
            sentenciaP.close();
            con.conexion.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void borrar_persona(int numdoc) throws SQLException{
        String query = "";
        ConexionBD con = new ConexionBD();
        
        try {
            query = "DELETE FROM Personas WHERE numero_documento = ?;";
            PreparedStatement sentenciaP = con.conectar().prepareStatement(query);
            sentenciaP.setInt(1, numdoc);
            sentenciaP.executeUpdate();
            System.out.println("El registro se eliminó exitosamente.");
            sentenciaP.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
   
    public ArrayList mostrarpersonas() throws SQLException {
        String query = "";
        ConexionBD con = new ConexionBD();       
        
        ArrayList listapersonas = new ArrayList();
        
        try{
            query = "SELECT * FROM Personas;";
            Statement sentencia = con.conectar().createStatement();          
            ResultSet resultado = sentencia.executeQuery(query);
            while(resultado.next()){
                
                int tipodoc =resultado.getInt("tipo_documento");
                int numerodoc =resultado.getInt("numero_documento");
                String apellidos = resultado.getString("apellidos");
                String nombres = resultado.getString("nombres");
                java.util.Date fechanacimiento = resultado.getDate("fecha_nacimiento");               
                
                Persona p = new Persona(tipodoc, numerodoc, apellidos, nombres, fechanacimiento);
                listapersonas.add(p);
            }
            sentencia.close();
            con.conexion.close();
        } catch (SQLException ex){
            System.out.println(ex.getMessage());            
        }
        return listapersonas;
    }
}
