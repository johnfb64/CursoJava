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
public class VehiculoTurismo extends Vehiculo{
    private int nPuertas;
    
    public VehiculoTurismo(int nPuertas,String matricula, String marca, String modelo){
        //super accede a atributos de clase padre
        super(matricula, marca,modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }
    
    //Se sobreescribe metodo heredado de padre con los datos nuevos necesarios, en este caso npuertas
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nModelo: "+modelo+"\nMarca: "+marca+
                "\nNumero de Puertas: "+nPuertas;
    }
    
    
    
}
