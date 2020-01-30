package app.main;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Programar para evaluar el valor de un numero,
		 * escribir en la consola si es negativo, si es positivo, o si es igual a cero.
		 */
	
		
		Scanner s1 = new Scanner(System.in);
		
		String nombre = "Gabriela ";
		System.out.println("Hola " + nombre + ", escribe un numero: ");
		int numero = s1.nextInt();
		
		if (numero >=1) {
			System.out.println("Este numero es positivo! ");
		} 
		
		if (numero <0) {
			System.out.println("Este numero es negativo");
		}
		if (numero == 0) {
			
			System.out.println("Este numero es igual a cero");
		}
		
		
		
	}

}
