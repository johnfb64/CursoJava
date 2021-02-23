/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciales;

import java.util.Scanner;

/**
 *
 * @author jhonn
 */
public class Iniciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n"); //lee espacios del objeto entrada
        System.out.println("Ingrese su nombre");        
        String miNombre = entrada.next();//Guarda nombre
               
        int nomTot = miNombre.length();//cuenta caracteres
        
        String nom = "";
        String sec = "";
        String vacio = " ";
        String primerNom = miNombre.substring(0,1);
                
        
        for(int i = 0; i < nomTot; i++){
            nom = miNombre.substring(i,i+1);
            
            if (nom.equals(vacio)){
                //Se detendra en espacios y sumara 1
                //para tomar la siguiente letra despues del espacio
                sec = miNombre.substring(i+1,i+2);
                primerNom = primerNom+sec;
            }
            
        }
        
               
        System.out.println(primerNom + "\n");
        
    }
    
}
