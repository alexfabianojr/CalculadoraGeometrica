package entities;
import java.util.Scanner;

import appGeometricCalculator.EscolhendoTipoGeometrico;

public class Circulo {

	public static void painelDaAreaDoCirculo () {

		Scanner sc = new Scanner(System.in);
			
			System.out.println("----------------------------------------------------------");
			
			System.out.println("Você escolheu calcular a area do circulo");
			
			System.out.println("Insira o raio do circulo:");
			double entradaDoRaio = sc.nextDouble();
			
			System.out.println("Area calculada do circulo " + 3.1415926 * Math.pow(entradaDoRaio, 2));
	}
}
