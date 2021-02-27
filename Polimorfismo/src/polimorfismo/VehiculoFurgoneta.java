/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author jhonn
 */
public class VehiculoFurgoneta extends Vehiculo{
    
    private int carga;

    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
    @Override // Sobreescribe datos de padre por datos extra cilindrada. 
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nModelo: "+modelo+"\nMarca: "+marca+
                "\nCilindrada: "+carga;
    }
    
    
}
