package Sergio;

public class Sergio {

	
	
	private String nombre = "Sergio";
	private String hobbies = "Leer, ver cine, y viajar";
	
	
	//Getter and Setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	// Constructores


public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	//Constructor sin parametro
	public Sergio() {
		super();
	}

	
	public Sergio(String nombre, String hobbies) {
		super();
		this.nombre = nombre;
		this.hobbies = hobbies;
	}

	// to String
	@Override
	public String toString() {
		return "Sergio [nombre=" + nombre + "]";
	}
	

	
//Método
public String imprimirNombre() {
	return "Hola, soy " + this.nombre;
}	
	
public String imprimirHobbies() {
	return "Mis hobbies son " + this.hobbies;
	
	
	
}
	
	


	
	
	
}
		
		
		
		
		

	


