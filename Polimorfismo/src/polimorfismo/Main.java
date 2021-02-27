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
public class Main {
    public static void main(String[] args) {
        
        //Polimorfismo = Cuando una clase padre puede instanciar clases hijas. 
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        //Primer elemento de arreglo que toma datos directo del padre
        misVehiculos[0] = new Vehiculo("ZF32", "Audi", "A29");
        //polimorfismo. Un objeto de clase padre guarda la instanciacion de una de sus hijas. Se agrega datos de puertas.
        misVehiculos[1] = new VehiculoTurismo(4, "F532", "Audi", "V8");
        //polimorfismo // Se agrega cilindraje
        misVehiculos[2] = new VehiculoDeportivo(500, "HU-PP", "Mazda", "352A");
        misVehiculos[3] = new VehiculoFurgoneta(1000, "qwerty", "Toyota", "SUV-288");
        
        //Los metodos actuaran diferente dependiendo de como se instancie. 
        
        for (Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
        
        
    }
}
