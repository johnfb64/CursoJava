/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author jhonn
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int semana = entrada.nextInt();
        
        String dia;
        switch(semana){
                case 1:
                    dia = "Domingo"; 
                break;
                case 2:
                    dia = "Lunes"; 
                break;
                case 3:
                    dia = "Martes"; 
                break;
                case 4:
                    dia = "Miercoles"; 
                break;
                case 5:
                    dia = "Jueves"; 
                break;
                case 6:
                    dia = "Viernes"; 
                break;
                case 7:
                    dia = "Sabado"; 
                break;
                default:
                    dia = "No existe ese dia";                
        }
        
        System.out.println("El numero " + semana + " es el dia " + dia);
    }
    
}
