package Pack1;

public class Estatic {
	
	//Static hara que el atributo frase sea de la clase y no de los objetos. 
	private static String frase = "Primera frase";
	
	public static void main(String[] args) {
		Estatic obj1 = new Estatic();
		Estatic obj2 = new Estatic();
		
		//Cambia para toda la clase al ser atributo Static. 
		obj2.frase= "Segunda Frase";
		
		System.out.println(obj1.frase);
		System.out.println(obj2.frase);
		
		System.out.println("La suma es: "+ Estatic.sumar(5, 5));
	}
	//Los metodos tambien pueden ser estaticos
	public static int sumar(int num1, int num2) {
		int suma = num1 + num2;
		return suma;
	}
	
	

	
}
