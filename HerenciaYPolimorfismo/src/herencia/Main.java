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
public class Main {
    
    public static void main(String[] args) {
        //Se instancia objeto de tipo animal con arreglos, dejando 4 espacios disponbiles
        Animal animal[] = new Animal[4];
        
        //Se instnacia clase padre
        animal[0] = new Animal("Ser vivo");
        //Se procede con polimorfismo, guardando cada elemento del array de clases 
        //hijas en objeto de clase padre Animal.
        
        animal[1] = new Perro("Mamifero", "Chow-chow");
        animal[2] = new Pez("Pez", "Insectos");
        animal[1] = new Serpiente("Reptil", true);
        
        for (Animal animales: animal) {
            System.out.println(animales.printMensaje());
            System.out.println("");
        }
        
        
    }
    
}
