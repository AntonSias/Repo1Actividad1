package anton;

public class Anton {
	
	//Atributos de la clase
	private String nombre = "Antón";
	
	
	//Constructores de la clase
	public Anton() {
		super();
	}
	
	public Anton(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Métodos
	
	public String imprimirNombre() {
		return "Hola, soy " + this.nombre;
	}

	public String imprimirHobbies(){

		return "Hacer deporte, tomar algo con mis amigos, jugar a videojuegos";
	}
	
	public String imprimirComidasFavoritas() {
		return "Mis comidas favoritas son: pasta, ensalada y hamburguesa";
	}

}
