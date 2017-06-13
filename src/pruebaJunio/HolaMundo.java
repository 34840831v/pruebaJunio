package pruebaJunio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HolaMundo {
	
	public static void main(String[] args) {
		
		System.out.println("Hola Mundo");
		Date ahora = new Date();
	    SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
	    System.out.println(formateador.format(ahora));
		
	}
}
