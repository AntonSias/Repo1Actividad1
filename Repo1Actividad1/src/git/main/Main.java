package git.main;

import Minerva.Minerva;
import Sergio.Sergio;
import anton.Anton;
import silvian.Silvian;

public class Main {

	public static void main(String[] args) {
		
//----------PARTE DE ANTON-----------------------------
		Anton anton = new Anton();
		
		System.out.println(anton.imprimirNombre());
		System.out.println(anton.imprimirHobbies());
		System.out.println(anton.imprimirComidasFavoritas());

//------------------PARTE DE SERGI------------------

    Sergio sergio = new Sergio();
    System.out.println(sergio.imprimirNombre());
    System.out.println(sergio.imprimirHobbies());



//-------------------------------------------------
  Minerva minerva = new Minerva();
  System.out.println(minerva.imprimirNombre());
  System.out.println(minerva.imprimirHobbies());
	
//----------SILVIAN----------------------------------
  Silvian silvian = new Silvian();
  System.out.println(silvian.imprimirNombre());
  System.out.println(silvian.imprimirHobbies());
  
	}

	
}
