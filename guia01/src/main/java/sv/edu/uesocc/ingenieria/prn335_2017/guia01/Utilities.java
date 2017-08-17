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
    /**
     * mediante substring me recorre el rango asignado y lo almaceno en la variable cadena
     * @param texto
     * @return cadena
     */
         public String getResume(String texto){
       String cadena=texto.substring(0, 29);
        return cadena;
    }
    
    public String capitalizar(String texto){
        String cap="";
        texto.replaceAll("  ", " ");
        cap=String.valueOf(texto.charAt(0)).toUpperCase();    
        for(int i=0;1<texto.length();i++){
            if(texto.charAt(i-1)==' ' || texto.charAt(i)==' '){
                cap=String.valueOf(texto.charAt(i)).toUpperCase();
            }else{
                cap+=texto.charAt(i);
            }
        }
             return cap;
       
    }
    public int contarCoincidencias(String frase, String texto){
        int coincidencia=0;      
   int posicion = texto.indexOf(frase);
   while (  posicion != -1 ) {
   coincidencia++;
   posicion = texto.indexOf(frase,posicion+1);
}
      return coincidencia;
    }
    
    
}
