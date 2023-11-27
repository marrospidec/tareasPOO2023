package holaMundo;

import java.util.Scanner;

public class SubprogramasTarea {
	
	String frase, fraseModificada;
	
	public String modificarTexto() {
		Scanner leer = new Scanner(System.in);
		int recorre = 0;
		String letra;
		
		System.out.println("Ingrese una frase:");
		frase = leer.nextLine();
		fraseModificada = "";
		
		while (recorre < frase.length()){
			letra = frase.substring(recorre, recorre+1);
			switch(letra) {
				case "a":
					fraseModificada = fraseModificada.concat("@");
					break;
				case "e":
					fraseModificada = fraseModificada.concat("#");
					break;
				case "i":
					fraseModificada = fraseModificada.concat("$");
					break;
				case "o":
					fraseModificada = fraseModificada.concat("%");
					break;
				case "u":
					fraseModificada = fraseModificada.concat("*");
					break;
				default:
					fraseModificada = fraseModificada.concat(letra);
			} 
			
			recorre = recorre + 1;
		}
		
		return fraseModificada;
	}
}
