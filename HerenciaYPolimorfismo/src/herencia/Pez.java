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
public class Pez extends Animal{
    private String alimentacion;

    public Pez(String especie,String alimentacion) {
        //Llama atributo del padre con super
        super(especie);
        this.alimentacion = alimentacion;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
    //Se sobreescribe el mensaje
    @Override
    public String printMensaje(){
        return "Especie: " + especie + "\nAlimentación: " + alimentacion;
    }
}
