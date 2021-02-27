/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescrituramiembros;

/**
 *
 * @author jhonn
 */
public class Persona extends Animal{
    
    @Override //Override sobre escribe el metodo "Comer" que viene de clase padre
    //ahora saldria el metodo comer de esta clase y no del padre
    public void comer(){
        
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
    
}
