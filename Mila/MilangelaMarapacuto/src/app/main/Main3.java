package app.main;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * En un main, programar para mostrar en base a un numero, una descripcion 
		 * 1. Microcoche
		 * 2. Automoviles Compactos
		 * 3. Automoviles Ultracompactos
		 * 4. Automovil familiar
		 * 5. Vehiculo de lujo
		 * 6. Automovil deportivo
		 * 7. Descapotable
		 * 8. Todoterreno
		 */

		Scanner s1 = new Scanner(System.in);
		
		String nombre = "Gabriela ";
		System.out.println("Hola " + nombre + ", escribe un numero del 1 al 8: ");
		int numero = s1.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Este numero corresponde a un Microcoche");
			
			break;

		case 2:
			System.out.println("Este numero corresponde a los Automoviles Compactos");
			
			break;

		case 3:
			System.out.println("Este numero corresponde a los automoviles ultracompactos");
			
			break;

		case 4:
			System.out.println("Este numero corresponde a automovil familiar");
			
			break;

		case 5:
			System.out.println("Este numero corresponde a un Vehiculo de lujo");
			
			break;

		case 6:
			System.out.println("Este numero corresponde a un Automovil deportivo");
			
			break;

		case 7:
			System.out.println("Este numero corresponde a un Descapotable");
			
			break;

		case 8:
			System.out.println("Este numero corresponde a un Todoterreno");
			
			break;

			
		default:
			break;
		}
		
	}

}
