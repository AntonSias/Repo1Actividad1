package Sergio;

public class Sergio {

	
		
		private String nombre = "Sergio";
		
		
		//Getter and Setter

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		
		// Constructores
		public Sergio(String nombre) {
			super();
			this.nombre = nombre;
		}
//Constructor sin parametro
		public Sergio() {
			super();
		}

		
		// to String
		@Override
		public String toString() {
			return "Sergio [nombre=" + nombre + "]";
		}
		

		
// Método
	public String imprimirNombre() {
		return "Hola, soy " + this.nombre;
	}
		
		


		
		
		
}
		
		
		
		
		

	


