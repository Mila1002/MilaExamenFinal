package app.main;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Construir un programa en java que permita encontrar el numero mayor
		 * y el numero menor de una serie de numeros ingresados por el teclado.
		 * Como primera entrada se le dara el tamaño del arreglo y luego los datos,
		 * tambien se debe indicar cuantas  veces se repiten tanto el mayor como el menor.
		 *  
		 */

			String nombre = "Gabriela";
			
			Scanner s1 =  new Scanner(System.in);
	        
			System.out.println("Hola " + nombre +  ", Por favor ingresa el numero de elementos: ");
	        
			int arreglo = s1.nextInt();
	        
			int[]numeros = new int[arreglo];
	        
			System.out.println("Vale, ahora ingresa los " + arreglo + " Numeros: ");
	        
			for(int i = 0; i < numeros.length; i++) {
				numeros[i] = s1.nextInt();
	        }
			int numMayor = Integer.MAX_VALUE; 
	        
	        int numMenor = Integer.MIN_VALUE; 
			
	        numMayor = numeros[0]; 
	        
	        numMenor = numeros[0]; 
	        
	        int num = 0;
	        
	        for(int i = 0; i < numeros.length; i++) {
	            num = numeros[i];
	        
	            if(num > numMayor)  // Numero mayor almacenado hasta ahora
	            	numMayor = num; // Si es mayor se reemplaza 
	            if(num <= numMenor)  // Numero menor almacenado hasta ahora
	            	num = numMenor; //Si es menor se reemplaza 
	        }
	        
	        int cantMayor = 0;
	        int cantMenor = 0;
	        
	        for(int j = 0; j < numeros.length; j++) {
	            num = numeros[j];
	            if(num == numMayor)
	                cantMayor++;
	            if(num == numMenor)
	                cantMenor++;
	        }
	        
	        System.out.println();
	        
	        System.out.println("Elementos: " + Arrays.toString(numeros));
	        
	        System.out.println();

	        System.out.println("Salida: ");
	        
	        System.out.println("El Numero Mayor es: " + numMayor + " y se repite  "+ cantMayor + " veces");
	    
	        System.out.println("El Numero Menor es: " + numMenor + " y se repite  "+ cantMenor + " veces");
	    }
		
		
	}


