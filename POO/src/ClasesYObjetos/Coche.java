/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

/**
 *
 * @author jhonn
 */
public class Coche {
    
    //Atributos
    String color;
    String marca;
    int km;
    
    //metodo
    public static void main(String[] args) {
        
        //Creando el objeto
        Coche coche = new Coche();
        Coche coche2 = new Coche();
        
        //rellenar atributos
        
        coche.color = "Amarillo";
        coche.marca = "Chevrolet";
        coche.km = 300;
        
        coche2.color = "Verde Oliva";
        coche2.marca = "Aston Martin";
        coche2.km = 150;
        
        System.out.println("El color del carro " + coche.marca + " es " + coche.color + 
                " y tiene " + coche.km + " Kilometros recorridos");
        
        System.out.println("\nEl color del carro " + coche2.marca + " es " + coche2.color + 
                " y tiene " + coche2.km + " Kilometros recorridos");
        
    }
    
}
