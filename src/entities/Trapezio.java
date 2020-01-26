package entities;

import java.util.Scanner;

public class Trapezio {
	

	private static Scanner sc = new Scanner (System.in);
	
	public static void executandoTrapezio () {
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Insira o valor de uma das bases: ");
		Double baseB = sc.nextDouble();
		
		System.out.println("Insira o valor da outra base: ");
		Double baseb = sc.nextDouble();
		
		System.out.println("Insira o valor da altura: ");
		Double altura = sc.nextDouble();
		
		System.out.println("Area do trapezio: " + ((baseB + baseb) * altura ) / 2);
	}
}
