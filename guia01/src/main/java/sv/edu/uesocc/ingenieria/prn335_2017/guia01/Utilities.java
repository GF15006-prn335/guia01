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
       String cadena=texto.substring(0,29);
        return cadena;
    }
    /**
     * primero quita los espacios doble con el replaceAll
     * y luego de guiado por los espacios convierte a mayuscula la primera
     * @param texto
     * @return cap
     */
    public String capitalizar(String texto){
        String cap="";
        texto.replaceAll("  ", " ");
        cap+=String.valueOf(texto.charAt(0)).toUpperCase();    
        for(int i=0;1<texto.length();i++){
         if(texto.charAt(i-1)==' ' || texto.charAt(i)==' '){
                cap+=String.valueOf(texto.charAt(i)).toUpperCase();
            }else{
                cap+=texto.charAt(i);
            }
        }
             return cap;
       
    }
    /**
     * mediante el indexof me devuelve la posicion y la compara con con la frase y texto
     * @param frase
     * @param texto
     * @return coincidencias
     */
   public int contarCoincidencias(String frase, String texto){
   int coincidencias=0;      
   int posicion = texto.indexOf(frase);
   while (  posicion != -1 ) {
   coincidencias++;
   posicion = texto.indexOf(frase,posicion+1);
}
      return coincidencias;
    }
    
    
}
