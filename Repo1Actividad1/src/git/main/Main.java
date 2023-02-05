package git.main;

import Minerva.Minerva;
import Sergio.Sergio;
import anton.Anton;

public class Main {

	public static void main(String[] args) {
		
//----------PARTE DE ANTON-----------------------------
		Anton anton = new Anton();
		
		System.out.println(anton.imprimirNombre());
		System.out.println(anton.imprimirHobbies());
//-----------------------------------------------------
	

Sergio sergio = new Sergio();
  System.out.println(sergio.imprimirNombre());
  System.out.println(sergio.imprimirHobbies());

//-------------------------------------------------
  Minerva minerva = new Minerva();
  System.out.println(minerva.imprimirNombre());
	}

	
}
