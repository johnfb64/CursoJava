package Pack1;

public class Class1 {
	
	//Modificador de acceso public permite acceder desde cualquier clase del programa
	//private limita solamente a clase
	private int edad;
	
	private String nombre;
	
	//Metodo Setter. Permite hacer cambios sobre atributo edad en private. 
	//Establece edad
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Metodo Getter. Get - Muestra
	//Muestra edad
	public int setEdad() {
		return edad;
	}

	//generados por la opcion >Source>generate
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
