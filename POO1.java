package tarea1;

import java.util.Scanner;

public class POO1 {
	
	public static void mostrarMenuPrincipal() {
		System.out.println("MENU : ");
		System.out.println("1. Realizar operacion");
		System.out.println("2. Salir");
	}
	
	public static void mostrarMenuOperaciones() {
		System.out.println("Escoga una opcion");
		System.out.println("1. SUMAR");
		System.out.println("2. RESTAR");
		System.out.println("3. MULTIPLICAR");
		System.out.println("4. DIVIDIR");	
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion1;
		do {
			mostrarMenuPrincipal();
			opcion1 = scanner.nextInt();
			if(opcion1 == 1 ) {
				double resultado = 0;
				System.out.println("Dime el primer argumento : ");
				double num1 = scanner.nextDouble();
				System.out.println("Dime el segundo argumento : ");
				double num2 = scanner.nextDouble();
				mostrarMenuOperaciones();
				int opcion2 = scanner.nextInt();
				switch(opcion2) {
				case 1 :
					resultado = num1 + num2;
					break;
				case 2 : 
					resultado = num1 - num2;
					break;
				case 3 : 
					resultado = num1 * num2;
					break;
				case 4 : 
					resultado = num1 / num2;
					break;
				}
				System.out.println("El resultado es : " + resultado);
				
			}else if (opcion1 != 2) {
				System.out.println("opicion erronea");
				
			}
		}while (opcion1 != 2);
		System.out.println("saliendo ... ");
	}

}
