/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaobjetos;

import java.util.*;



/**
 *
 * @author DAVIDESPITIA
 */
public class Persona {
    private int tipodocumento;
    private int num_documento;
    private String nombres;
    private String apellidos;
    private Date fechanacimiento;

    
    //CONSTRUCTORES DE OBJETOS
    public Persona() {
    }

    public Persona(int tipodocumento, int num_documento, String nombres, String apellidos, Date fechanacimiento) {
        this.tipodocumento = tipodocumento;
        this.num_documento = num_documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
    }
    
    //GETTERS & SETTERS PARA VARIABLES

    public int getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(int tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public int getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(int num_documento) {
        this.num_documento = num_documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechanacimiento() {        
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    
    public String imprimirLinea(){
        String linea =tipodocumento + ";" + num_documento + ";" + apellidos + ";" + nombres + ";" + fechanacimiento;
        return linea;
    }
    
}
