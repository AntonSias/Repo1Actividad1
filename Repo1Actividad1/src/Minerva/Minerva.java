package Minerva;

public class Minerva {
	
	
    /*
     * Atibutos de la clase
     */
	private String nombre = "Minerva";

	/*
	 * Constructores sin parámetros
	 */
	public Minerva() {
		super();
	}
	/*
	 * Constructores con parámetros
	 */
	public Minerva(String nombre) {
		super();
		this.nombre = nombre;
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
	
	/*
	 * métodos
	 */
	public String imprimirNombre() {
		return "Hola, soy " + this.nombre;
}
}