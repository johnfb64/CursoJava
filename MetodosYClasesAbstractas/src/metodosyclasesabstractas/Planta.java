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
public class Planta extends SerVivo{
    
    //Se requiere implementar el metodo abstracto por medio de sobreescritura
    @Override
    public void alimentarse(){
        System.out.println("La planta se alimenta a travez de fotosintensis");
    }
    
    
    
}
