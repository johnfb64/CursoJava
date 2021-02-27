Que es polimorfismo?

- En una relacion de tipo herencia, un objeto de la superclase puede almacenar un objeto de cualquier da sus subclases. 
- La clase padre o superclase es compatible con los tipos que derivan de ella. 
- Objetos de clase padre que pueden ser instanciados por sus clases hijas. Ejemplo:

Vehiculo = Clase padre

Instanciando:
//Super clase
Vehiculo miVehiculo = new Vehiculo("12GB","Ferrari","A8");
//Hija1:
Vehiculo miVehiculo2 = new VehiculoTurismo("12GB","Ferrari","A8",4);
//Hija2:
Vehiculo miVehiculo3 = new VehiculoTurismo("12GB","Ferrari","A8",500);
etc.. 

Notese que se crea un objeto y se instancia no solo con la super clase, se crea un objeto de tipo superclase con las clases hijas. Se rellenarian de mas, los datos particulares de cada una de las clases hijas. De esta manera se interpreta las muchas formas que puede tomar un objeto. 

UML

- #Matricula: String // # es protected