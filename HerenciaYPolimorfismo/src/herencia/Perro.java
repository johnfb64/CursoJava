/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author jhonn
 */
public class Perro extends Animal{
    
    private String raza;

    public Perro(String especie,String raza) {
        //Llama atributo del padre con super
        super(especie);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    //Se sobreescribe el mensaje
    @Override
    public String printMensaje(){
        return "Especie: " + especie + "\nRaza: " + raza;
    }
    
}
