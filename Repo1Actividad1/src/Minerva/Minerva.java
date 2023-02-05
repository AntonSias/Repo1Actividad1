package Minerva;

public class Minerva {
	
	
    /*
     * Atibutos de la clase
     */
	private String nombre = "Minerva";
	private String hobbies = "Musica, cine, teatro";
	
	/*
	 * Constructores sin parámetros
	 */
	public Minerva() {
		super();
	}
	/*
	 * Constructores con parámetros
	 */
	public Minerva(String nombre, String hobbies) {
		super();
		this.nombre = nombre;
		this.hobbies = hobbies;
	}
	
	/*
	 * Getter and setter
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	/*
	 * To string
	 */
	@Override
	public String toString() {
		return "Minerva [nombre=" + nombre + ", hobbies=" + hobbies + "]";
	}
	/*
	 * Metodos
	 */
	public String imprimirNombre() {
		return "Hola, soy " + this.nombre;
	}	
		
    public String imprimirHobbies() {
    	return "Mis hobbies son " + this.hobbies;
		
    }
}