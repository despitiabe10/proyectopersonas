/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaobjetos;

/**
 *
 * @author DAVIDESPITIA
 */
public class TipoDocumento {
    private int cod_tipo_documento;
    private String descripcion_documento;
    
    //CONSTRUCTORES

    public TipoDocumento() {
    }

    public TipoDocumento(int cod_tipo_documento, String descripcion_documento) {
        this.cod_tipo_documento = cod_tipo_documento;
        this.descripcion_documento = descripcion_documento;
    }
    
    //GETTERS & SETTERS PARA VARIABLES

    public int getCod_tipo_documento() {
        return cod_tipo_documento;
    }

    public void setCod_tipo_documento(int cod_tipo_documento) {
        this.cod_tipo_documento = cod_tipo_documento;
    }

    public String getDescripcion_documento() {
        return descripcion_documento;
    }

    public void setDescripcion_documento(String descripcion_documento) {
        this.descripcion_documento = descripcion_documento;
    }
    
    
    
}
