
public class Persona {

	//Sobrecarga de constructores: Cuando hay mas de un constructor
	//Puede haber sobrecarga desde y cuando los constructores sean de diferente tipo. 
	
	String nombre;
	int edad;
	String Cedula;
	
	
	//Constructor
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String cedula) {
		super();
		Cedula = cedula;
	}
	
	//Sobre carga de metodos
	//Hay mas de un metodo correr, se diferencia por cantidad o tipo de parametros. 
	
	public void correr() {
		System.out.println("Soy " + nombre + " tengo " + edad + " y estoy corriendo una maraton");
	}
	
	public void correr(int km){
		System.out.println("He corrido " + km + " Kilometros.");
		
	}
	
	
	
}
