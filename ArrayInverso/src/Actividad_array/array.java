/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_array;

import java.util.Scanner;

/**
 *
 * @author jhonn
 */
public class array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese 5 numeros: ");
        
        int cant_array = 5; // limite de los arrays. 
        //---Logica del array numerico-------//
                      
        float[] array_numeros = new float [cant_array];        
        for(int i=0;i<5;i++){
            array_numeros[i] = scanner.nextFloat();            
        }
        //---Logica del array de nombres---//
        
        System.out.println("Ingese 5 nombres:");
        String[] array_nombres = new String[cant_array];
        for(int n=0;n<5;n++){
            array_nombres[n] = scanner.next();            
        }
        
        //---Prints en pantalla controlados por for
        
        System.out.println("Arreglos inversos: ");  
        System.out.println("----------Numeros----------");
        for (int j=4;j>=0;j--){
            System.out.println(array_numeros[j]);
        }
        System.out.println("----------Nombres----------");
        for (int z=4;z>=0;z--){
            System.out.println(array_nombres[z]);
        }
        
        
        
        
    }
    
}
