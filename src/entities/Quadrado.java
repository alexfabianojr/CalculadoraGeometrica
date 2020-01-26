package entities;

import java.util.Scanner;

public class Quadrado {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void executandoQuadrado() {
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Insira o valor do lado do quadrado: ");
		Double valorQuadrado = sc.nextDouble();
		
		System.out.println("Area do quadrado: " + ((valorQuadrado) * 2));
		}
}
