package git.main;

import Sergio.Sergio;
import anton.Anton;

public class Main {

	public static void main(String[] args) {
		
//----------PARTE DE ANTON-----------------------------
		Anton anton = new Anton();
		
		System.out.println(anton.imprimirNombre());
//-----------------------------------------------------
	
//------------------PARTE DE SERGI------------------

    Sergio sergio = new Sergio();
    System.out.println(sergio.imprimirNombre());
    System.out.println(sergio.imprimirHobbies());

//-------------------------------------------------
	}

}
