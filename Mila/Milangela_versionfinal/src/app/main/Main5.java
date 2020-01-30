package app.main;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Crear la cadena de texto: 
		 * "Nunca mates una mosca sobre la cabeza de un tigre"
		 * -Mostrar la cadena en Mayusculas
		 * -Mostrar la cadena en Minusculas
		 * -Mostrar solo la palabra nunca
		 * -Mostrar solo la palabra mosca
		 * -Mostrar solo la palabra cabeza
		 * -Mostrar la posicion dela letra primera M
		 * -Devolver la longitud de la cadena
		 */
		
		String cadena = "Nunca mates una mosca sobre la cabeza de un tigre.";
		
				System.out.println("Texto Original: " + "\n" + cadena);
				System.out.println();
				System.out.println("Mayusculas: " + "\n" + cadena.toUpperCase());
				System.out.println();
				System.out.println("Minusculas: " + "\n" + cadena.toLowerCase());
				System.out.println();
				System.out.println("Solo una palabra: " + "\n" + cadena.substring(0, 5));
				
				System.out.println(cadena.substring(16, 21));
				
				System.out.println(cadena.substring(31, 37));
				System.out.println();
				System.out.println("La posicion de la primera letra M es : " + cadena.indexOf("m"));
				System.out.println();
				System.out.println("La longitud de la cadena es de: " + cadena.length() + " caracteres");
	}

}
