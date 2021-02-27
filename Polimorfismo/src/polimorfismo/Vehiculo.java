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
public class Vehiculo {
    
    protected String matricula;
    protected String marca;
    protected String modelo;
    
    public Vehiculo(String matricula, String marca, String modelo){
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nModelo: "+modelo+"\nMarca: "+marca;
    }
    
    
}
