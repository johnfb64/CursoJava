/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosyclasesabstractas;

/**
 *
 * @author jhonn
 */
public class Carnivoro extends Animal{
    //Se debe poner el metodo abstracto de la super clase para que no genere error. 
    @Override
    public void alimentarse(){
        System.out.println("El animal carnivoro se alimenta de carne");
    }
    
}
