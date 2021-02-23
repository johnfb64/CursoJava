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
public class Operacion {
    //Atributos
    int num1;
    int num2;
    int sum;
    int res;
    int mul;
    int div;
    
    //metodos
    
    //Pedir al usuario dos numeros para leer
    //Es void por que no retornara ningun valor
    public void leerNumeros(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite segundo numero: "));
    }
    
    //metodos para operaciones
    public void sumar(){
        sum = num1 + num2;
    }
    public void restar(){
        res = num1 - num2;
    }
    public void multiplicar(){
        mul = num1 * num2;
    }
    public void dividir(){
        div = num1 / num2;
    }
    
    //metodo para imprimir resultados
    public void resultados(){
        System.out.println("La suma de los numeros es " + sum);
        System.out.println("La resta de los numeros es " + res);
        System.out.println("La multiplicacion de los numeros es " + mul);
        System.out.println("La division de los numeros es " + div);
    }
    
    
    
}
