package silvian;

public class Silvian {

	//Atributos de la clase
		private String nombre = "Silvian";
		
		//Constructores de la clase
		public Silvian() {
			super();
		}
		
		public Silvian(String nombre) {
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

			return "Jugar futbol , ir al gimnasio y leer sobre los coches ";
	
}
}