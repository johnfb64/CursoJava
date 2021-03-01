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
public class Serpiente extends Animal{
    private boolean venenosa;
    
   

    public Serpiente(String especie,boolean Venenosa) {
        //Llama atributo del padre con super
        super(especie);
        this.venenosa = Venenosa;
    }
    
    

    public boolean isVenenosa() {
        
        return this.venenosa = true;
    }

    public void setVenenosa(boolean Venenosa) {
        this.venenosa = Venenosa;
    }
    //Se sobreescribe el mensaje
    @Override
    public String printMensaje(){
        return "Especie: " + especie + "\nvenenosa: " + venenosa;
    }
    
}
