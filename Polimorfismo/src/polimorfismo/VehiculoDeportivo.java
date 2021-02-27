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
public class VehiculoDeportivo extends Vehiculo{
    private int cilindrada;

    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    
    @Override // Sobreescribe datos de padre por datos extra cilindrada. 
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nModelo: "+modelo+"\nMarca: "+marca+
                "\nCilindrada: "+cilindrada;
    }
}
