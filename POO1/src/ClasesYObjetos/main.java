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
public class main {
    public static void main(String [] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero: "));
        
        Operacion op = new Operacion();
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int multiplica = op.multiplicar(n1, n2);
        int divide = op.dividir(n1, n2);
        
        op.resultados(suma, resta, suma, divide);
        
        
    }
    
}
