/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacorreo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angie Castañeda
 */
public class ListaCorreo {
    
    private String correo;
    
    /**
    * 
    * Constructor de la clase
     * @param correo
    */
    public ListaCorreo(String correo) {    
        this.correo = correo;
    }
    /**
    * 
    * Metodo que retorna
     * @return 
    */
    public String getCorreo() {
        return correo;
    }
    /**
    * 
    * Metodo que modifica
     * @param correo
    */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
