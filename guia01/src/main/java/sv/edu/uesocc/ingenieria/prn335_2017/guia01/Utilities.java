/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.guia01;

/**
 *
 * @author PC17
 */
public class Utilities {
         public String getResume(String texto){
       String cadena=texto.substring(0, 29);
        return cadena;
    }
    
    public String capitalizar(String texto){
        String cap=texto.replaceAll("  ", "");
        return cap;
        
    }
}
