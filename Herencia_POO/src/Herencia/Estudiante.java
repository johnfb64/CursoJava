/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author jhonn
 */

//CLASE QUE HEREDA DE PERSONA
public class Estudiante extends Persona{
    private int codigoEstudiante;
    private float notaFinal;
    
    //Se crea constructor con atributos del padre "Persona"
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
        
        //Se personalizan atributos dentro de clase persona:
        super(nombre,apellido,edad);
        //Se inicializan atributos de esta clase
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = codigoEstudiante;        
        
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: " +getApellido()+
                "\nEdad: " + getEdad() +
                "\nCodigo Esudiante: "+codigoEstudiante+
                "\nNota Final: "+notaFinal);
    }
    
}
