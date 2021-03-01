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
public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public String printMensaje(){
        return "Tipo de especie: "+especie;
    }
}
