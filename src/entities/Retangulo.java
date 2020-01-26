package entities;

import java.util.Scanner;

public class Retangulo {

		private static Scanner sc = new Scanner (System.in);
		
		public static void executandoRetangulo () {
			
			System.out.println("----------------------------------------------------------");
			
			System.out.println("Entre com a base do retangulo: ");
			Double baseRetangulo = sc.nextDouble();
			
			System.out.println("Entre com a altura do retangulo: ");
			Double alturaRetangulo = sc.nextDouble();
			
			System.out.println("Area do Retangulo: " + (baseRetangulo * alturaRetangulo));
		}
}
