/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author jhonn
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("####Programa Calculadora Basica###");
        
        //Pedir los dos numeros al usuario. 
        
        Scanner no1 = new Scanner(System.in); 
        System.out.println("Digite el primer numero: ");        
        double num1 = no1.nextDouble();
        
        Scanner no2 = new Scanner(System.in); 
        System.out.println("Digite el segundo numero: ");        
        double num2 = no2.nextDouble();
        
        //Indicar la operación que puede ejeucatar
        
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
         
        //leer la opción para proceder y guardarla en opcion
        Scanner Opc = new Scanner(System.in);
        System.out.println("Escoja la operación a ejecutar\n"); 
        
        int Operacion = Opc.nextInt();

        //Opciones de ejecución
        
        switch(Operacion){
            case 1:
                double sum = num1 + num2; 
                System.out.println("Resultado: " + sum);
                break;
            case 2:
                double res = num1 - num2; 
                System.out.println("Resultado: " + res);
                break;
                
            case 3:
                double mul = num1 * num2; 
                System.out.println("Resultado: " + mul);
                break;
                
            case 4:
                double div = num1 / num2; 
                System.out.println("Resultado: " + div);
                break;
        
        }
        
    }
    
}
