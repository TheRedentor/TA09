package ejercicio6;

public class Ejercicio6App {

	public static void main(String[] args) {
		//creamos los espectadores
		Espectador[] espectadores = iniciarEspectadores();
		//Creamos la película
		Pelicula kungFusion = new Pelicula("Kung Fu Sion", "juan perez", 120, 16);
		//iniciamos el cine
		Cine cine = new Cine(kungFusion, 10);
		//Asignamos los asientos a los espectadores
		cine.sentarEspectadores(espectadores);
		//Imprimimos los asientos ocupados y vacíos
		cine.mostrarSala();
	}
	
	//Crea un array con 20 espectadores con edad y dinero aleatorio
	public static Espectador[] iniciarEspectadores() {
		Espectador[] espectadores = new Espectador[20];
		
		espectadores[0] = new Espectador("Paul");
		espectadores[1] = new Espectador("Maria");
		espectadores[2] = new Espectador("Anna");
		espectadores[3] = new Espectador("Rosa");
		espectadores[4] = new Espectador("Andres");
		espectadores[5] = new Espectador("Pau");
		espectadores[6] = new Espectador("Pepe");
		espectadores[7] = new Espectador("Pedro");
		espectadores[8] = new Espectador("Tomas");
		espectadores[9] = new Espectador("Lucia");
		espectadores[10] = new Espectador("Alma");
		espectadores[11] = new Espectador("Juan");
		espectadores[12] = new Espectador("Julio");
		espectadores[13] = new Espectador("Mia");
		espectadores[14] = new Espectador("Fernando");
		espectadores[15] = new Espectador("Josep");
		espectadores[16] = new Espectador("Toni");
		espectadores[17] = new Espectador("Ernesto");
		espectadores[18] = new Espectador("Nuria");
		espectadores[19] = new Espectador("Cori");
		
		return espectadores;
	}
}
