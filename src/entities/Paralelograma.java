package entities;

import java.util.Scanner;

public class Paralelograma {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void executandoParalelograma () {

		System.out.println("----------------------------------------------------------");
		
		System.out.println("Entre com o lado do paralelograma: ");
		Double ladoDoParalelograma = sc.nextDouble();
		
		System.out.println("Entre com a altura do paralelograma: ");
		Double alturaDoParalelograma = sc.nextDouble();
		
		System.out.println("Area do paralelograma: " + (ladoDoParalelograma * alturaDoParalelograma));
	}
}
