/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author jhonn
 */

//RETORNO DE VALORES//
public class Operacion {
   
    //metodos
    
    //Pedir al usuario dos numeros para leer
    //Es void por que no retornara ningun valor
    
    
    //metodos para operaciones
    //Entre parentesis estan los parametros.. 
    
    public int sumar(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public int restar(int num1, int num2){
        int res = num1 - num2;
        return res;
    }
    public int multiplicar(int num1, int num2){
        int mul = num1 * num2;
        return mul;
    }
    public int dividir(int num1, int num2){
        int div = num1 / num2;
        return div;
    }
    
    //metodo para imprimir resultados
    public void resultados(int sum, int res, int mul, int div){
        System.out.println("La suma de los numeros es " + sum);
        System.out.println("La resta de los numeros es " + res);
        System.out.println("La multiplicacion de los numeros es " + mul);
        System.out.println("La division de los numeros es " + div);
    }
    
    
    
}
